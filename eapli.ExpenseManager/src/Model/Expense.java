package Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Paulo Gandra Sousa
 */

public class Expense {
    
    ExpenseType expenseType;
    Calendar date;
    BigDecimal amount;
     PaymentType paymentType;
    
    protected Expense() {}
    
     public Expense( ExpenseType expenseType, Calendar dateOccurred, PaymentType paymentType, BigDecimal amount) {
        if (expenseType == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException();
        }
        this.expenseType = expenseType;
        this.paymentType = paymentType;
        this.amount = amount;
        this.date = dateOccurred;
    }
    
    public Expense( ExpenseType expenseType, int year, int month, int day, PaymentType paymentType, BigDecimal amount) {
        this( expenseType, DateTime.newCalendarDate(year, month, day), paymentType, amount);
    }
    
    public Expense(Expense exp) {
        this.expenseType = exp.expenseType;
        this.amount = exp.amount;
        this.paymentType = exp.paymentType;
        this.date = exp.date;
    }
    
    public Expense( ExpenseType expenseType, Calendar dateOccurred, BigDecimal amount) {
        if (expenseType == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException();
        }
        this.expenseType = expenseType;
        this.amount = amount;
        this.date = dateOccurred;
    }
    
    public Expense( ExpenseType expenseType, int year, int month, int day, BigDecimal amount) {
        this( expenseType, DateTime.newCalendarDate(year, month, day), amount);
    }
//    
//    public Expense(Expense exp) {
//        this.expenseType = exp.expenseType;
//        this.amount = exp.amount;
//        this.date = exp.date;
//    }
    
    public Calendar getDate() {
        return date;
    }
    
    public BigDecimal getAmount() {
        return amount;
    }
    
    public ExpenseType getDescription() {
        return expenseType;
    }

   
}
