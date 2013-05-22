package eapli.expensemanager.presentation;


import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.IncomeController;
import eapli.expensemanager.model.IncomeType;
import java.util.List;

class ListIncomeTypesUI  extends BaseUI {
    
    private IncomeController controller = new IncomeController();
     
    public BaseController controller() {
        return controller;
    }

    public void run() {
        System.out.println("* * *  INCOME TYPES  * * *\n");
        List<IncomeType> listIncomeTypes = controller.getIncomeTypes();

        for (int i = 0; i < listIncomeTypes.size(); i++) {
            System.out.println((i+1) + ". " + listIncomeTypes.get(i));  
        }
    }
}
