
package eapli.expensemanager.controllers;


import eapli.expensemanager.persistence.IExpenseRepository;
import eapli.expensemanager.persistence.PersistenceFactory;
import java.math.BigDecimal;


public class BaseController {
    
    /**
     * gets the expenditure of the current week
     */
    public BigDecimal getThisWeekExpenditure() {
        IExpenseRepository repo = PersistenceFactory.
                buildPersistenceFactory().expenseRepository();
        return repo.getThisWeekExpenditure();
    }
    
    /**
     * gets the expenditure of the current week
     */
    public BigDecimal getThisMonthExpenditure() {
        IExpenseRepository repo = PersistenceFactory.
                buildPersistenceFactory().expenseRepository();
        return repo.getThisMonthExpenditure();
    }
    
}
