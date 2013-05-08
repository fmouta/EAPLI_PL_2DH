/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ExpensesController;
import Controllers.IncomeRegisterController;
import Model.IncomeType;
import eapli.util.Console;
import java.util.Calendar;
import java.math.BigDecimal;

public class IncomeRegisterUI  extends BaseUI {

    private ExpensesController controller = new ExpensesController();

    public BaseController controller() {
        return controller;
    }
       
    

    public void mainLoop2() {
        System.out.println("* * *  REGISTER AN INCOME  * * *\n");

        IncomeType what = new IncomeType(Console.readLine("Description:"));
        Calendar date = Console.readDate("Date:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        
        IncomeRegisterController controller =new IncomeRegisterController();
        
        controller.registerIncome();
        System.out.println("Income Recorded");
    }
}
