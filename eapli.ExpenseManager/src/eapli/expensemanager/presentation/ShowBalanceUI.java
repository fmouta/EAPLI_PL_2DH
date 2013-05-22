package eapli.expensemanager.presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import eapli.expensemanager.controllers.BalanceController;
import eapli.expensemanager.controllers.BaseController;
import java.math.BigDecimal;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ShowBalanceUI extends BaseUI {
    
    private BalanceController controller = new BalanceController();
    
    public BaseController controller() {
        return controller;
    }
    
    public void run() {
        System.out.println("* * *  BALANCE  * * *\n");
        BigDecimal balance = controller.getBalance();
        System.out.println("  Balance= " + balance);
    }
}  
