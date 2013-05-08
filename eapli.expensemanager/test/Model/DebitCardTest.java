/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ben
 */
public class DebitCardTest {
    
    DebitCard dc;
    int id;
    String bank;
    PaymentTypeEnum pte;
    
    public DebitCardTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        id=1;
        bank="CGD";
        pte=PaymentTypeEnum.Check;
        dc=new DebitCard(id,pte,bank);
    }
    
    @After
    public void tearDown() {
    }

      /**
     * Test of getType method, of class PaymentType.
     */
    @Test
    public void testGetType() {
        PaymentTypeEnum expResult = pte;
        PaymentTypeEnum result = dc.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of getIDNumber method, of class PaymentType.
     */
    @Test
    public void testGetIDNumber() {
        int expResult = 1;
        int result = dc.getIDNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getBank method, of class PaymentType.
     */
    @Test
    public void testGetBank() {
        String expResult = "CGD";
        String result = dc.getBank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class PaymentType.
     */
    @Test
    public void testToString() {
        String expResult = "Check : 1, CGD";
        String result = dc.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
