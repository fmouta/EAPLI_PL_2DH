package Presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import Controllers.ExpensesController;

import Model.Expense;
import Model.ExpenseType;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
class AllExpensesUI extends BaseUI {
    public void mainLoop() {
        System.out.println("* * *  SHOW ALL EXPENSES  * * *\n");
        
        ExpensesController controller = new ExpensesController();
        List<Expense> list = controller.getAllExpenses();
        for (Expense exp: list) {
            BigDecimal amount = exp.getAmount();
            ExpenseType expenseType = exp.getDescription();
            
            System.out.println("Expense:");
            System.out.println("\tAmount = " + amount);
            System.out.println("\tDescription = " + expenseType);
        }   
    }
}
