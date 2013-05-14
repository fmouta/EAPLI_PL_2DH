/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import eapli.expensemanager.model.ExpenseType;
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
        String result = instance.toString();
        assertNotNull("Null RESUT var", result);
        assertEquals(("Expense Type: "  + description), result);
    }
}
