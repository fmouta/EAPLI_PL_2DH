/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.presentation;


import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ExpenseController;
import eapli.expensemanager.controllers.IncomeController;
import eapli.expensemanager.model.Income;
import eapli.expensemanager.model.IncomeType;
import java.math.BigDecimal;
import java.util.List;

class ListIncomesUI  extends BaseUI {
  
    private IncomeController controller = new IncomeController();
    
    public BaseController controller() {
        return controller;
    }    
    public void run() {
        System.out.println("* * *  INCOMES  * * *\n");
        List<Income> listIncomes = controller.getIncomes();

        for (int i = 0; i < listIncomes.size(); i++) {
            System.out.println((i+1) + ". " + listIncomes.get(i));  
        }
    }
}
