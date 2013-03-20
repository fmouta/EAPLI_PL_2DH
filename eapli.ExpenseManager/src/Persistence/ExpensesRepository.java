package Persistence;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import Model.Expense;
import Model.*;
import Model.Expense;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author losa
 */
public class ExpensesRepository  implements IExpensesRepository
{
    // class member
    private static List<Expense> listExpense= new ArrayList<Expense>();

    public ExpensesRepository() {}
    
    public void save(Expense exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listExpense.add(exp);
        Expense expense = listExpense.get(listExpense.size() -1);  
    }    
    
    public Expense getLastExpense()
    {
        Expense expense = null;
        if (listExpense.size() > 0) 
            expense = listExpense.get(listExpense.size() -1);
        return expense;
    }
}
