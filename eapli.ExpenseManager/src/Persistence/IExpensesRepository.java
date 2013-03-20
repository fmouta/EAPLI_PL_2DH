package Persistence;
 
import Model.Expense;
import java.util.List;
/**
 *
 * @author losa
 */
public interface IExpensesRepository {
    void save(Expense exp);
    Expense getLastExpense();
    List<Expense> getAllExpenses();        
}
