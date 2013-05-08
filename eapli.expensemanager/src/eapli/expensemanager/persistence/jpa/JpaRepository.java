package eapli.expensemanager.persistence.jpa;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

/**
 * based on
 * http://stackoverflow.com/questions/3888575/single-dao-generic-crud-methods-jpa-hibernate-spring
 * and on https://burtbeckwith.com/blog/?p=40
 */
public abstract class JpaRepository<T, PK extends Serializable> {

//    @PersistenceUnit
    static protected EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("eapli.expensemanagerPU");
    protected Class<T> entityClass; 
    
    protected EntityManager getEntityManager() {
        EntityManager entityManager = emf.createEntityManager();
        return entityManager;
    }
    
    public JpaRepository() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass()
                .getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass
                .getActualTypeArguments()[0];
    }

    public T create(T t) {
        this.getEntityManager().persist(t);
        return t;
    }

    public T read(PK id) {
        return this.getEntityManager().find(entityClass, id);
    }

    // alias to read()
    public T findById(PK id) {
        return read(id);
    }
    
    public T update(T t) {
        return this.getEntityManager().merge(t);
    }

    public void delete(T t) {
        t = this.getEntityManager().merge(t);
        this.getEntityManager().remove(t);
    }

    // alias to getCount();
    public long size() {
        return getCount();
    }
    
    public long getCount() {
        return (Long) getEntityManager().createQuery(
                "SELECT COUNT(*) FROM " + entityClass.getSimpleName())
                .getSingleResult();
    }

    @SuppressWarnings("unchecked")
    public Collection<T> findAll() {
        return getEntityManager().createQuery(
                "SELECT e FROM " + entityClass.getSimpleName() + " e")
                .getResultList();
    }

    /**
     * inserts or updates an entity
     * 
     * check http://blog.xebia.com/2009/03/23/jpa-implementation-patterns-saving-detached-entities/
     * for a discussion on saveOrUpdate() behaviour and merge()
     *
     * @param entity
     * @return the persisted entity - migth be a diferent object than the
     * parameter
     */
    public T save(T entity) {
        if (entity == null) {
            throw new IllegalArgumentException();
        }

        EntityManager em = getEntityManager();
        assert em != null;
        try {
            // transaction will be rolled back if any exception occurs
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();
                em.persist(entity);
                tx.commit();
            } catch (PersistenceException ex) {
                tx.rollback();
                // we need to set up a new transaction if persist raises an exception
                tx = em.getTransaction();
                tx.begin();
                entity = em.merge(entity);
                tx.commit();
            }
        } finally {
            em.close();
        }

        return entity;
    }

    public List<T> all() {
        // TODO check performance impact of this 'where' clause
        return match("1=1");

//        EntityManager em = getEntityManager();
//        assert em != null;
//
//        String tableName = entityClass.getName(); //entityClass.getAnnotation(Table.class).name();
//        Query q = em.createQuery("SELECT it FROM " + tableName + " it");
//        List<T> all = q.getResultList();
//        return all;
    }

    public List<T> match(String where) {
        EntityManager em = getEntityManager();
        assert em != null;

        String tableName = entityClass.getSimpleName(); //entityClass.getAnnotation(Table.class).name();
        Query q = em.createQuery("SELECT it FROM " + tableName + " it WHERE " + where);
        List<T> some = q.getResultList();
        return some;
    }
}
