/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeRegisterController;
import eapli.util.Console;

/**
 *
 * @author i091325
 */
public class ExpenseTypeRegisterUI {
    
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN EXPENSE TYPE  * * *\n");
        
        
        
        String description = Console.readLine("Description:");
        
        ExpenseTypeRegisterController control = new ExpenseTypeRegisterController();
        control.registerExpenseType(description);
        
        System.out.println("Expense type recorded.");
    }
    
     public void Create(){
        
    }
    
}
