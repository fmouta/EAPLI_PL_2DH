package eapli.expensemanager.presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.IncomeController;
import eapli.util.Console;

/**
 *
 * @author Paulo Gandra Sousa
 */
class RegisterIncomeTypeUI  extends BaseUI {
     
    private IncomeController controller = new IncomeController();

    public BaseController controller() {
        return controller;
    }

    public void run() {
        System.out.println("* * *  REGISTER AN INCOME TYPE  * * *\n");
        String descr = Console.readLine("Description:");
        controller.registerIncomeType(descr);
        System.out.println("\nIncome type recorded!");      
    }    
}
