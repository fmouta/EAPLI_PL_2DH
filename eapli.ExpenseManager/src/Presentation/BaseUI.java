
package Presentation;

import Controllers.BaseController;
import java.text.NumberFormat;

public abstract class BaseUI {
    
    abstract BaseController controller();
    abstract void mainLoop2();
    
     public void mainLoop() {
         mainLoop2();
         showBalances();
     }
    
    public void showBalances() {
        System.out.println("------------------------------------------");
        System.out.print("");
        System.out.print("This week expenditure: ");
        System.out.print(NumberFormat.getCurrencyInstance().
                format(controller().getThisWeekExpenditure()));
        System.out.print("  |  ");
                System.out.print("This month expenditure: ");
        System.out.println(NumberFormat.getCurrencyInstance().
                format(controller().getThisMonthExpenditure()));
        System.out.println("------------------------------------------");
    }
    
    
}
