/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.persistence.inmemory;


import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.persistence.IExpenseTypeRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author i111623
 */
public class ExpenseTypeRepositoryImpl implements IExpenseTypeRepository{
    private static List<ExpenseType> listExpenceType = new ArrayList<ExpenseType>();
    
    @Override
    public ExpenseType save(ExpenseType et) {
        listExpenceType.add(et);
        return et;
    }

    @Override
    public List<ExpenseType> all() {
        return Collections.unmodifiableList(listExpenceType);
    }
}
