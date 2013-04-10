package Controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import Model.Expense;
import Persistence.ExpensesRepository;
import Persistence.IExpensesRepository;
import java.util.List;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpensesController {

    public ExpensesController() {
    }

    public Expense getLastExpense() {
        IExpensesRepository repo = new ExpensesRepository();
        return repo.getLastExpense();
    }
    
    public List<Expense> getAllExpenses() {
        IExpensesRepository repo = new ExpensesRepository();
        return repo.getAllExpenses();
    }
    
    public void definePaymentType() {
        
    }
    
    public List<Integer> getAllExpensesYears(){
        IExpensesRepository repo = new ExpensesRepository();
        return repo.getAllExpensesYears();
    }
    
}
