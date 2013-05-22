package eapli.expensemanager.presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ExpenseController;
import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.ExpenseType;


import java.math.BigDecimal;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpensesUI  extends BaseUI {

    private ExpenseController controller = new ExpenseController();
    
    public BaseController controller() {
        return controller;
    }
    
    public void run() {
//        System.out.println("* * *  SHOW LAST EXPENSE  * * *\n");
//        
//        ExpenseController controller = new ExpenseController();
//        Expense exp = controller.getLastExpense();
//        if (exp != null) {
//            BigDecimal amount = exp.getAmount();
//            String expenseType = exp.getDescription();
//            
//            System.out.println("Last Expense:");
//            System.out.println("\tAmount = " + amount);
//            System.out.println("\tDescription = " + expenseType);
//        } else {
//            System.out.println("There are no expenses.");
//        }

        
    }
}
