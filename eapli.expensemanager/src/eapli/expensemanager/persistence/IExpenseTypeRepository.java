/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.persistence;


import eapli.expensemanager.model.ExpenseType;
import java.util.List;

/**
 *
 * @author i111623
 */
public interface IExpenseTypeRepository {
    ExpenseType save(ExpenseType expenseType);
//    List<ExpenseType> getAllExpenseTypes();
    List<ExpenseType> all();
    
//    ExpenseType findForName(String key);
}
