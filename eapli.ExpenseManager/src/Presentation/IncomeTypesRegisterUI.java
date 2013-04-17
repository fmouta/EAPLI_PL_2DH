package Presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 


import Controllers.BaseController;
import Controllers.ExpensesController;
import Controllers.IncomeTypeRegisterController;
import eapli.util.Console;

/**
 *
 * @author Paulo Gandra Sousa
 */
class IncomeTypeRegisterUI  extends BaseUI {
    
        
    private ExpensesController controller = new ExpensesController();
    
    
    public BaseController controller() {
        return controller;
    }
    
    
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN INCOME TYPE  * * *\n");
        
        String type = Console.readLine("Type:");
        
        IncomeTypeRegisterController controller = new IncomeTypeRegisterController();
        controller.registerIncomeType(type);
        
        System.out.println("Income type recorded.");
    }
    
}
