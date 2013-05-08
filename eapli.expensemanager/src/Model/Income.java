/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author i110422
 */

public class Income 
{
    IncomeType description; 
    Calendar date;
    BigDecimal amount;
    
    protected Income() 
    {        
    } 
    
    public Income(IncomeType description, Calendar date, BigDecimal amount)
    {        
        if (description == null || date == null || amount == null) 
        {
            throw new IllegalArgumentException();
        }
       
        if (amount.signum() == -1 || amount.signum() ==  0) 
        {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.amount = amount;
        this.date = date;
    }
    
     public Income( IncomeType description, int year, int month, int day, BigDecimal amount) 
     {
        this( description, DateTime.newCalendarDate(year, month, day), amount);
    }
    
    public Income(Income exp) 
    {
        this.description = exp.description;
        this.amount = exp.amount;
        this.date = exp.date;
    }  
    
     public Calendar getDate() {
        return date;
    }
    
    public BigDecimal getAmount() {
        return amount;
    }
    
    public IncomeType getDescription() {
        return description;
    }
}
