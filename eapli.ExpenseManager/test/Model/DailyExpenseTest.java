/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ben
 */
public class DailyExpenseTest {
    
    DailyExpense det;
    int day;
    int month;
    int year;
    BigDecimal value;
    
    public DailyExpenseTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        value=new BigDecimal(12);
        det=new DailyExpense(21,3,2009,value);
        day=21;
        month=3;
        year=2009;
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDay method, of class DailyExpense.
     */
    @Test
    public void testGetDay() {
        int expResult = 21;
        int result = det.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMonth method, of class DailyExpense.
     */
    @Test
    public void testGetMonth() {
        int expResult = 3;
        int result = det.getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getYear method, of class DailyExpense.
     */
    @Test
    public void testGetYear() {
        int expResult = 2009;
        int result = det.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getValue method, of class DailyExpense.
     */
    @Test
    public void testGetValue() {
        BigDecimal expResult = value;
        BigDecimal result = det.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of equals method, of class DailyExpense.
     */
    @Test
    public void testEquals() {
        DailyExpense test = new DailyExpense(21,3,2009,value);
        DailyExpense instance = det;
        boolean expResult = true;
        boolean result = instance.equals(test);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addValue method, of class DailyExpense.
     */
    @Test
    public void testAddValue() {
        BigDecimal amount = new BigDecimal(6);
        DailyExpense instance = det;
        instance.addValue(amount);
        int expResult= 18;
        assertEquals(instance.getValue().intValue(),det.getValue().intValue());
        // TODO review the generated test code and remove the default call to fail.
    }
}
