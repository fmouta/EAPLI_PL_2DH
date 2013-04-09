package Presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import Controllers.ExpensesController;

import Model.Expense;
import Model.ExpenseType;
import java.math.BigDecimal;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpensesUI {
    public void mainLoop() {
        System.out.println("* * *  SHOW LAST EXPENSE  * * *\n");
        
        ExpensesController controller = new ExpensesController();
        Expense exp = controller.getLastExpense();
        if (exp != null) {
            BigDecimal amount = exp.getAmount();
            ExpenseType expenseType = exp.getDescription();
            
            System.out.println("Last Expense:");
            System.out.println("\tAmount = " + amount);
            System.out.println("\tDescription = " + expenseType);
        } else {
            System.out.println("There are no expenses.");
        }

        
        
        
    }
}
