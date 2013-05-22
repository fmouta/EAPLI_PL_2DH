package eapli.expensemanager.controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 


import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.Payment;
import eapli.expensemanager.model.PaymentMeans;
import eapli.expensemanager.persistence.IExpenseTypeRepository;
import eapli.expensemanager.persistence.IExpenseRepository;
import eapli.expensemanager.persistence.PersistenceFactory;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseController  extends BaseController {
        
    public void registerExpenseType(String descr) {
        ExpenseType expenseType = new ExpenseType(descr);
        IExpenseTypeRepository repo = PersistenceFactory.
                buildPersistenceFactory().expenseTypeRepository();
        repo.save(expenseType);
    }
    
    public void registerExpense(String what, Date date, BigDecimal amount,
            ExpenseType expenseType, Payment payment) {
        Expense expense = new Expense(expenseType, what, date, amount, payment);
        IExpenseRepository repo = PersistenceFactory.
                buildPersistenceFactory().expenseRepository();
        repo.save(expense);
    }

    public List<ExpenseType> getExpenseTypes() {
        IExpenseTypeRepository repo = PersistenceFactory.
                buildPersistenceFactory().expenseTypeRepository();
        return repo.all();
    }
    
    public List<Expense> getExpenses() {
        IExpenseRepository repo = PersistenceFactory.
                buildPersistenceFactory().expenseRepository();
        return repo.all();
    }
    
//    public Expense getLastExpense() {
//        IExpenseRepository repo = PersistenceFactory.
//                buildPersistenceFactory().expenseRepository();
//        return repo.getLastExpense();
//    }

    public List<PaymentMeans> getPaymentMeans() {
        return PaymentMeans.loadAll();
    }
     
    public BigDecimal getTotalWeek() {
        IExpenseRepository repo = PersistenceFactory.
                buildPersistenceFactory().expenseRepository();
        return repo.getThisWeekExpenditure();
    }
    
    public BigDecimal getTotalMonth()  {
        IExpenseRepository repo = PersistenceFactory.
                buildPersistenceFactory().expenseRepository();
        return repo.getThisMonthExpenditure();
    }
}
