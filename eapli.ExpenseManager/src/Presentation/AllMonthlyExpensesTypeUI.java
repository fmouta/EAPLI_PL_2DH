/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

//import Persistence.ExpensesTypesRepository;
import Controllers.BaseController;
import Controllers.ExpensesController;
import Model.ExpenseType;
import Model.MonthlyExpense;
import java.util.List;

/**
 *
 * @author Ben
 */
public class AllMonthlyExpensesTypeUI  extends BaseUI {
    
        
    private ExpensesController controller = new ExpensesController();
    
    
    public BaseController controller() {
        return controller;
    }
    

    public void mainLoop() {

        ExpensesController controller = new ExpensesController();
        List<Integer> years = controller.getAllExpensesYears();
        List<ExpenseType> expensestypes = controller.getAllExpenseTypes();
        MonthlyExpense temp;

        for(ExpenseType expt: expensestypes){
            System.out.println("\nExpense Type: "+expt.getDescription());
            for (int d : years) {
                for (int j = 1; j <= 12; j++) {
                    temp = new MonthlyExpense();
                    try {
                        temp.getMonthlyExpenseType(d, j,expt);
                        if (temp.getValue().intValue() != 0) {
                         System.out.println(temp);
                        }

                    } catch (NullPointerException e) {
                        System.out.println("Não existem despesas registadas no sistema!\n");
                        break;
                      }
               }
            }
        }

    }
}
