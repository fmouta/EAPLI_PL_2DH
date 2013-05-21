/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import eapli.expensemanager.persistence.inmemory.ExpenseRepositoryImpl;
import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.Payment;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestgetThisMonthExpenditure {
        private Expense ex;
        
        
    public TestgetThisMonthExpenditure() {
        ExpenseRepositoryImpl repo = new ExpenseRepositoryImpl();
        repo.save(new Expense(new ExpenseType("Jantar"), "Jantar com amigos", new Date(2013,7,15), new BigDecimal(15.4), new Payment()));
    }
   @Test
    public void testGetTotalMonth() {
        System.out.println("getTotalMonth");
        ExpenseRepositoryImpl instance = new ExpenseRepositoryImpl();
        BigDecimal expResult = new BigDecimal(0);
        BigDecimal result = instance.getThisMonthExpenditure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    } 
 } 
   