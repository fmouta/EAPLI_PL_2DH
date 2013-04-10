package Presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import Controllers.ExpensesRegisterController;
import Controllers.ExpensesRegisterController;
import Model.ExpenseType;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI {
    
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
        
        ExpenseType what = new ExpenseType(Console.readLine("Description:"));
        Calendar date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        
        ExpensesRegisterController controller = new ExpensesRegisterController();
        
        
        
        controller.registerExpense(what, date, amount);
        
        System.out.println("expense recorded.");
    }
    public void Create(){
        
    }
}
