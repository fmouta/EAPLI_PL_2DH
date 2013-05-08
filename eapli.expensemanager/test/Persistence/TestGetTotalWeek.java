/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import eapli.expensemanager.model.DailyExpense;
import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.ExpenseType;
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




    
 
public class TestGetTotalWeek {
        private Expense ex;
        
        
    public TestGetTotalWeek() {
        IExpensesRepository repo = new ExpensesRepository();
        repo.save(new Expense(new ExpenseType("Jantar"), 2013, 4, 15, new BigDecimal(13.4)));
    }
   @Test
    public void testGetTotalWeek() {
        System.out.println("getTotalWeek");
        ExpensesRepository instance = new ExpensesRepository();
        BigDecimal expResult = new BigDecimal(13);
        BigDecimal result = instance.getTotalWeek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    } 
    

 
 } 