/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;


import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ExpenseController;
import eapli.expensemanager.model.ExpenseType;
import java.util.List;

/**
 *
 * @author i091325
 */
public class ListExpenseTypesUI extends BaseUI {
    
    private ExpenseController controller = new ExpenseController();
    
    public BaseController controller() {
        return controller;
    }
    
    public void run() {
        System.out.println("* * *  EXPENSES TYPES  * * *\n");
        List<ExpenseType> listExpenseTypes = controller.getExpenseTypes();

        for (int i = 0; i < listExpenseTypes.size(); i++) {
            System.out.println((i+1) + ". " + listExpenseTypes.get(i));  
        }
    }
}
