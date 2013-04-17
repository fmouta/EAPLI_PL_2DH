package Presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import Controllers.BaseController;
import Controllers.ExpensesController;
import Model.Expense;
import Model.MonthlyExpense;
import Persistence.ExpensesRepository;
import Persistence.IExpensesRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class AllMonthlyExpensesUI extends BaseUI {
    
        
    private ExpensesController controller = new ExpensesController();
    
    
    public BaseController controller() {
        return controller;
    }
    
    
    public void mainLoop() {
          
        ExpensesController controller = new ExpensesController();
        List<Integer> years = controller.getAllExpensesYears();
        MonthlyExpense temp;
        for(int d: years){
            for(int j=1;j<=12;j++){
            temp = new MonthlyExpense();
            try{
               temp.getMonthlyExpense(d, j);
               if(temp.getValue().intValue()!=0)
               System.out.println(temp);
               
            } catch(NullPointerException e)
              {
                   System.out.println("Não existem despesas registadas no sistema!\n");
                   break;
               } 
            }
        }
        
        
        
    }
    
}
