package eapli.expensemanager.presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ExpenseController;
import eapli.expensemanager.model.Expense;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ListExpensesUI extends BaseUI {
    
    private ExpenseController controller = new ExpenseController();
    
    public BaseController controller() {
        return controller;
    }
    
    public void run() {
        System.out.println("* * *  ALL EXPENSES  * * *\n");
        List<Expense> listExpenses = controller.getExpenses();

        for (int i = 0; i < listExpenses.size(); i++) {
            System.out.println((i+1) + ". " + listExpenses.get(i));  
        }
    }   
}
