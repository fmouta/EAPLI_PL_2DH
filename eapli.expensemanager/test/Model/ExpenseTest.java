/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.Payment;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i111623
 */
public class ExpenseTest {
        private Expense ex;
        private String type;
        
    public ExpenseTest() {
        type = "Autocarro";
        ex = new Expense(new ExpenseType(type), "Viagem de autocarro, Porto - Lisboa",
                new Date(2013, 12, 22), new BigDecimal(2.4), new Payment());
    }
    
    @Test
    public void testGetDescription() {
        assertEquals("Viagem de autocarro", ex.getDescription());
    }
    
    @Test
    public void testGetExpenseType() {
        ExpenseType result = ex.getExpenseType();
        assertNotNull("Null RESUT var", result);
        assertEquals("Expense Type: " + type, result.toString());
    }
}

