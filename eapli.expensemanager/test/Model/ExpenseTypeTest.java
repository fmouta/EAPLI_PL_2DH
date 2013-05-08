/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class ExpenseTypeTest {
    
    public ExpenseTypeTest() {
    }

    @Test
    public void testGetDescription() {
        String description = "Almoço";
        
        System.out.println("getDescription");
        ExpenseType instance = new ExpenseType(description);
        String result = instance.getDescription();
        assertNotNull("Null RESUT var", result);
        assertEquals(description, result);
    }
}
