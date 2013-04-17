/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.DailyExpense;
import Model.Expense;
import Model.ExpenseType;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;




    
 
public class TestGetTotalMonth {
        private Expense ex;
        
        
    public TestGetTotalMonth() {
        IExpensesRepository repo = new ExpensesRepository();
        repo.save(new Expense(new ExpenseType("Jantar"), 2013, 4, 15, new BigDecimal(15.4)));
    }
   @Test
    public void testGetTotalMonth() {
        System.out.println("getTotalMonth");
        ExpensesRepository instance = new ExpensesRepository();
        BigDecimal expResult = new BigDecimal(15);
        BigDecimal result = instance.getTotalMonth().round(new MathContext(2));
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    } 
    

 
 } 
   