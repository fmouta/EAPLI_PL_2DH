/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.IExpenseTypesRepository;
import Persistence.ExpenseTypeRepository;

/**
 *
 * @author i091325
 */
public class ExpenseTypeRegisterController {
      public ExpenseTypeRegisterController() {
    }

    public void registerExpenseType(String description) {
        ExpenseType expenseType = new ExpenseType(description);
        IExpenseTypesRepository repo = new ExpenseTypeRepository();
        repo.save(expenseType);
    }  

   
}
