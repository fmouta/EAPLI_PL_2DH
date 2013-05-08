package Controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import Model.Expense;
import Persistence.ExpensesRepository;
import Persistence.IExpensesRepository;
import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import Persistence.IExpenseTypesRepository;
import java.math.BigDecimal;
import java.util.List;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpensesController  extends BaseController {

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
    
    public void save(){
        
    }
    
    public List<ExpenseType> getAllExpenseTypes() {
        IExpenseTypesRepository repo = new ExpenseTypeRepository();
        return repo.getAllExpenseTypes();
    }
    
    public BigDecimal getTotalWeek() {
        IExpensesRepository repo = new ExpensesRepository();
        return repo.getThisWeekExpenditure();
    }
    
    public BigDecimal getTotalMonth()  {
        IExpensesRepository repo = new ExpensesRepository();
        return repo.getThisMonthExpenditure();
    }
}
