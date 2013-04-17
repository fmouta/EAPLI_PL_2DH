package eapli.bootstrap;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import Persistence.ExpensesRepository;
import Model.Expense;
import Model.Expense;
import Model.ExpenseType;
import Persistence.ExpensesRepository;
import Persistence.IExpensesRepository;
import java.math.BigDecimal;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpensesBootstrapper {

    static {
        IExpensesRepository repo = new ExpensesRepository();
        repo.save(new Expense(new ExpenseType("Autocarro"), 2013, 3, 4, new BigDecimal(2.4)));
        repo.save(new Expense(new ExpenseType("Almoço"), 2013, 3, 5, new BigDecimal(12.4)));
        repo.save(new Expense(new ExpenseType("Sapatilhas"), 2013, 3, 4, new BigDecimal(123.4)));
        repo.save(new Expense(new ExpenseType("Cinema"), 2013, 3, 4, new BigDecimal(5.0)));
        repo.save(new Expense(new ExpenseType("Jantar"), 2013, 4, 15, new BigDecimal(13.4)));
    }
}
