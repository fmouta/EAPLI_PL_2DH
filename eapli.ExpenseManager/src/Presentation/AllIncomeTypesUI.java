package Presentation;

import Controllers.BaseController;
import Controllers.ExpensesController;
import Controllers.IncomeTypeController;
import Model.IncomeType;
import java.util.List;

class AllIncomeTypesUI  extends BaseUI {
    
    private ExpensesController controller = new ExpensesController();
     
    public BaseController controller() {
        return controller;
    }
      
    public void mainLoop2() {
        System.out.println("* * *  INCOME TYPES  * * *\n");
        
        IncomeTypeController controller = new IncomeTypeController();
        List<IncomeType> list = controller.getAllIncomeTypes();
        int i = 0;
        for (IncomeType exp: list) {
            String type = exp.toString();            
            System.out.println(i + " - " + type + "\n");
            i++;
        }   
    }
}
