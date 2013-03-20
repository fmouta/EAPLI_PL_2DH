package Persistence;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import Model.Expense;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ExpensesRepository  implements IExpensesRepository
{
    // class member
    private static List<Expense> listExpense= new ArrayList<Expense>();

    public ExpensesRepository() {}
    
    public void save(Expense exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listExpense.add(exp);  
    }    
    
    public Expense getLastExpense()
    {
        Expense ret = null;
        Expense expense = null;
        int size = listExpense.size();
        if (size > 0) expense = listExpense.get(size -1);
        if (expense != null) ret = new Expense(expense);
        return ret;
    }    
    
    public List<Expense> getAllExpenses()
    {
        return Collections.unmodifiableList(listExpense);
    }
}
