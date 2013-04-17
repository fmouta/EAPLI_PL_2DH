package Presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import Controllers.BaseController;
import Controllers.ExpenseTypeController;
import Controllers.ExpensesController;
import Controllers.ExpensesRegisterController;
import Model.ExpenseType;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI  extends BaseUI {
    
        
    private ExpensesController controller = new ExpensesController();
    
    
    public BaseController controller() {
        return controller;
    }
    
    
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
        
        AllExpensesTypesUI u1= new AllExpensesTypesUI();
        u1.mainLoop();
        
        int option=Integer.parseInt(Console.readLine("Escolha uma das descrições acima descritas:\n \n Description:"));
        ExpenseTypeController control = new ExpenseTypeController();
        List<ExpenseType> list = control.getAllExpenseTypes();
        
        ExpenseType what = new ExpenseType((list.get(option).getDescription()));
        
        
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
