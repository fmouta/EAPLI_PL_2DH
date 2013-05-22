/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;


import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ExpenseController;
import eapli.util.Console;

/**
 *
 * @author i091325
 */
public class RegisterExpenseTypeUI  extends BaseUI {
    
    private ExpenseController controller = new ExpenseController();
    
    public BaseController controller() {
        return controller;
    }
    
    public void run() {
        System.out.println("* * *  REGISTER AN EXPENSE TYPE  * * *\n");
        String descr = Console.readLine("Description:");
        controller.registerExpenseType(descr);
        System.out.println("\nExpense type recorded!");      
    } 
}
