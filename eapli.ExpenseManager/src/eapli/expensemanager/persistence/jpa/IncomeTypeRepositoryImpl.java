
package eapli.expensemanager.persistence.jpa;

import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.persistence.IIncomeTypeRepository;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class IncomeTypeRepositoryImpl extends JpaRepository<IncomeType, Long> implements IIncomeTypeRepository {


    public IncomeType findForName(String description) {
        if (description == null || description.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        
        EntityManager em = getEntityManager();

        IncomeType incomeType;
        Query q = em.createQuery("SELECT e FROM ExpenseType e WHERE e.description = :description").setParameter("description", description);
        try {
            incomeType = (IncomeType) q.getSingleResult();
        }
        catch (NoResultException ex)
        {
            incomeType = null;          
        }
        return incomeType;
    }
}
