/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.expensemanager.model.Income;
import eapli.expensemanager.model.IncomeType;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ben
 */
public class IncomeTest {
    
    Income inc;
    IncomeType inct;
    Calendar date;
    BigDecimal amount;
    
    public IncomeTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        inct=new IncomeType("Salário");
        date=DateTime.newCalendarDate(2003, 3, 1);
        amount=new BigDecimal(12);
        inc=new Income(inct,date,amount);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDate method, of class Income.
     */
    @Test
    public void testGetDate() {
        Calendar expResult = DateTime.newCalendarDate(2003, 3, 1);
        Calendar result = inc.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAmount method, of class Income.
     */
    @Test
    public void testGetAmount() {
        BigDecimal expResult = new BigDecimal(12);
        BigDecimal result = inc.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDescription method, of class Income.
     */
    @Test
    public void testGetDescription() {
        IncomeType expResult = inct;
        IncomeType result = inc.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
