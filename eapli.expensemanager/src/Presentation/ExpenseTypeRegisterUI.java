/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ExpenseTypeRegisterController;
import Controllers.ExpensesController;
import eapli.util.Console;

/**
 *
 * @author i091325
 */
public class ExpenseTypeRegisterUI  extends BaseUI {
    
    private ExpensesController controller = new ExpensesController();

    public BaseController controller() {
        return controller;
    }
     
    public void mainLoop2() {
        System.out.println("* * *  REGISTER AN EXPENSE TYPE  * * *\n");
        
        
        
        String description = Console.readLine("Description:");
        
        ExpenseTypeRegisterController control = new ExpenseTypeRegisterController();
        control.registerExpenseType(description);
        
        System.out.println("Expense type recorded.");
    }
    
     public void Create(){
        
    }
    
}
