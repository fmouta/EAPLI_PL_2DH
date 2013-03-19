package Controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import Model.Expense;
import Model.Expense;
import Model.Expense;

import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;
import eapli.bootstrap.ExpensesBootstrapper;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpensesRegisterController {

    public ExpensesRegisterController() {
    }

    public void registerExpense(String what, Date date, BigDecimal amount) {
        ExpensesBootstrapper e = new ExpensesBootstrapper();
        Expense expense = new Expense( what, date, amount);
        IExpensesRepository repo = new ExpensesRepository();
        repo.save(expense);
    }
    
}
