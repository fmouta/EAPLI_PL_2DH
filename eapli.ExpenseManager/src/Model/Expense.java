package Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author Paulo Gandra Sousa
 */

public class Expense {
    
    ExpenseType expenseType;
    Date date;
    BigDecimal amount;
    
    protected Expense() {}
    
    public Expense( ExpenseType expenseType, Date dateOccurred, BigDecimal amount) {
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
        this( expenseType, DateTime.newDate(year, month, day), amount);
    }
    
    public Expense(Expense exp) {
        this.expenseType = exp.expenseType;
        this.amount = exp.amount;
        this.date = exp.date;
    }
    
    public Date getDate() {
        return date;
    }
    
    public BigDecimal getAmount() {
        return amount;
    }
    
    public ExpenseType getDescription() {
        return expenseType;
    }

   
}
