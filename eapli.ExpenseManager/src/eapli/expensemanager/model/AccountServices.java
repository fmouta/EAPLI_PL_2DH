/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import eapli.expensemanager.persistence.IExpenseRepository;
import eapli.expensemanager.persistence.IIncomeRepository;
import eapli.expensemanager.persistence.PersistenceFactory;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class AccountServices {
    
    public BigDecimal getBalance() {
        BigDecimal total = new BigDecimal(0);
        total = total.add(sumAmount(getIncomes()));
        total = total.subtract(sumAmount(getExpenses())); 
        return total;
    }
    
    public List<Expense> getExpenses() {
        IExpenseRepository repo = PersistenceFactory.
                buildPersistenceFactory().expenseRepository();
        return repo.all();
    }
    
      
    public List<Income> getIncomes() {
        IIncomeRepository repo = PersistenceFactory.
                buildPersistenceFactory().incomeRepository();
        return repo.all();
    }
    
    public BigDecimal sumAmount(List<? extends Movement> movements) {
        BigDecimal sum = new BigDecimal(0);
        for (Movement m: movements) {
            sum = sum.add(m.getAmount());
        }
        return sum;
    }
    
}
