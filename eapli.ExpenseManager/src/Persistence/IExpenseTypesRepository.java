/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import java.util.List;

/**
 *
 * @author i111623
 */
public interface IExpenseTypesRepository {
    void save(ExpenseType et);
    List<ExpenseType> getAllExpenseTypes();
}
