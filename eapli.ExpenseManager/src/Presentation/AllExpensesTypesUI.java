/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeController;
import Model.ExpenseType;
import java.util.List;

/**
 *
 * @author i091325
 */
public class AllExpensesTypesUI {
    public void mainLoop() {
        System.out.println("* * *  EXPENSES TYPES  * * *\n");
        
        ExpenseTypeController controller = new ExpenseTypeController();
        List<ExpenseType> list = controller.getAllExpenseTypes();
        int i = 0;
        for (ExpenseType exp: list) {
            String type = exp.toString();            
            System.out.println(i + " - " + type + "\n");
            i++;
        }   
    }
}
