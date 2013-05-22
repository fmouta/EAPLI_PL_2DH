package eapli.expensemanager.presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ExpenseController;
import eapli.expensemanager.model.MonthlyExpense;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class AllMonthlyExpensesUI extends BaseUI {
     
    private ExpenseController controller = new ExpenseController();

    public BaseController controller() {
        return controller;
    }
 
    public void run() {
          
//        ExpenseController controller = new ExpenseController();
//        List<Integer> years = controller.getAllExpensesYears();
//        MonthlyExpense temp;
//        for(int d: years){
//            for(int j=1;j<=12;j++){
//            temp = new MonthlyExpense();
//            try{
//               temp.getMonthlyExpense(d, j);
//               if(temp.getValue().intValue()!=0)
//               System.out.println(temp);
//               
//            } catch(NullPointerException e)
//              {
//                   System.out.println("Não existem despesas registadas no sistema!\n");
//                   break;
//               } 
//            }
//        }
        
        
        
    }
    
}
