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


public class TestegetThisWeekExpenditure {
        private Expense ex;
        
        
    public TestegetThisWeekExpenditure() {
        ExpenseRepositoryImpl repo = new ExpenseRepositoryImpl();
        repo.save(new Expense(new ExpenseType("Jantar"), "Jantar com amigos", new Date(2013,4,20), new BigDecimal(15), new Payment()));
    }
   @Test
    public void testGetTotalWeek() {
        System.out.println("getTotalWeek");
        ExpenseRepositoryImpl instance = new ExpenseRepositoryImpl();
        BigDecimal expResult = new BigDecimal(15);
        BigDecimal result = instance.getThisWeekExpenditure().round(new MathContext(2));
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    } 
 } 