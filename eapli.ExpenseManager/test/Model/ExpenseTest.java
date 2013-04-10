/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
        
    public ExpenseTest() {
        ex = new Expense(new ExpenseType("Autocarro"), 2013, 12, 22, new BigDecimal(2.4));
    }
    
    @Test
    public void testGetDate() {
        SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
        Calendar date = ex.getDate();
        assertEquals("22/12/2013", sdf1.format(date));
    }
}

