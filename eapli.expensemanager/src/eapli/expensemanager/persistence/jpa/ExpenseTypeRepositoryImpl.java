package eapli.expensemanager.persistence.jpa;

import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.persistence.IExpenseTypeRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class ExpenseTypeRepositoryImpl extends JpaRepository<ExpenseType, String> implements IExpenseTypeRepository {
    
    
    public ExpenseType findOrCreate(String description) {
        if (description == null || description.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        
        EntityManager em = getEntityManager();

        ExpenseType expenseType;
        Query q = em.createQuery("SELECT e FROM ExpenseType e WHERE e.description = :description").setParameter("description", description);
        try {
            expenseType = (ExpenseType) q.getSingleResult();
        }
        catch (NoResultException ex)
        {
            expenseType = new ExpenseType(description);
            save(expenseType);           
        }
        return expenseType;
    }


    public ExpenseType findForName(String description) {
        if (description == null || description.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        
        EntityManager em = getEntityManager();

        ExpenseType expenseType;
        Query q = em.createQuery("SELECT e FROM ExpenseType e WHERE e.description = :description").setParameter("description", description);
        try {
            expenseType = (ExpenseType) q.getSingleResult();
        }
        catch (NoResultException ex)
        {
            expenseType = null;          
        }
        return expenseType;
    }
}
