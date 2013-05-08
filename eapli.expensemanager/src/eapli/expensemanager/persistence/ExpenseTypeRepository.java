/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.persistence;


import eapli.expensemanager.model.ExpenseType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author i111623
 */
public class ExpenseTypeRepository implements IExpenseTypesRepository{
    private static List<ExpenseType> listExpenciveType = new ArrayList<ExpenseType>();
    
    @Override
    public void save(ExpenseType et) {
        listExpenciveType.add(et);
    }

    @Override
    public List<ExpenseType> getAllExpenseTypes() {
        return Collections.unmodifiableList(listExpenciveType);
    }
}
