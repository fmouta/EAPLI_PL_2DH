/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ExpensesController;
import Controllers.IncomeRegisterController;
import Model.Income;
import Model.IncomeType;
import java.math.BigDecimal;
import java.util.List;

class AllIncomesUI  extends BaseUI {
  
    private ExpensesController controller = new ExpensesController();
    
    public BaseController controller() {
        return controller;
    }
    
    public void mainLoop2() {
        System.out.println("\"* * *  INCOMES  * * *\\n\"");
        IncomeRegisterController controller = new IncomeRegisterController();
        List<Income> list = controller.registerIncome();
        for (Income inc : list) {
            BigDecimal amount = inc.getAmount();
            IncomeType incometype = inc.getDescription();
            System.out.println("Income:");
            System.out.println("\tAmount = " + amount);
            System.out.println("\tDescription = " + incometype);
        }
    }
}
