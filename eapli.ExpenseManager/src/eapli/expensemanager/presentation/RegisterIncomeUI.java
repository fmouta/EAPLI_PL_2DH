/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;


import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ExpenseController;
import eapli.expensemanager.controllers.IncomeController;
import eapli.expensemanager.model.IncomeType;

import eapli.util.Console;
import java.util.Calendar;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class RegisterIncomeUI  extends BaseUI {

    private IncomeController controller = new IncomeController();

    public BaseController controller() {
        return controller;
    }
       
    public void run() {
        System.out.println("* * *  REGISTER AN INCOME  * * *\n");
        String what = Console.readLine("What:");
        Date date = Console.readDate("When (dd-MM-yyyy):");
        double value = Console.readDouble("How much:");
        BigDecimal amount = new BigDecimal(value);
        IncomeType incomeType = readIncomeType();       

        controller.registerIncome(what, date, amount, incomeType);
        System.out.println("\nIncomeType recorded!");
    }
        
    private IncomeType readIncomeType() {
        System.out.println("-- INCOME TYPES --");
        List<IncomeType> listIncomeTypes = controller.getIncomeTypes();

        for (int i = 0; i < listIncomeTypes.size(); i++) {
            System.out.println((i+1) + ". " + listIncomeTypes.get(i));  
        }
        int option = Console.readOption(1, listIncomeTypes.size(), 0);
        
        IncomeType incomeType = listIncomeTypes.get(option-1);
        return incomeType;
    }
}
