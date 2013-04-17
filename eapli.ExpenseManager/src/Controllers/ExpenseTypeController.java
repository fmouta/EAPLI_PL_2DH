/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.IExpenseTypesRepository;
import Persistence.ExpenseTypeRepository;
import java.util.List;

/**
 *
 * @author i091325
 */
public class ExpenseTypeController extends BaseController {
       public ExpenseTypeController() {
    }
   
    public List<ExpenseType> getAllExpenseTypes() {
        IExpenseTypesRepository repo = new ExpenseTypeRepository();
        return repo.getAllExpenseTypes();
    }
}
