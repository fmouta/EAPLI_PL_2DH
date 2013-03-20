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
    
    String description;
   
    BigDecimal amount;
    
    protected Expense() {}
    
    public Expense( String description, Date dateOccurred, BigDecimal amount) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative expense or a zero EUR expense
        if (amount.signum() == -1 || amount.signum() ==  0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
    }
    
    public Expense( String description, int year, int month, int day, BigDecimal amount) {
        this( description, DateTime.newDate(year, month, day), amount);
    }
    
    public Expense(Expense exp) {
        this.description = exp.description;
        this.amount = exp.amount;
    }
    
    public BigDecimal getAmount() {
        return amount;
    }

   
}
