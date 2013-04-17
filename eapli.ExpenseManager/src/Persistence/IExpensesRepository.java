package Persistence;
 
import Model.DailyExpense;
import Model.Expense;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author losa
 */
public interface IExpensesRepository {
    void save(Expense exp);
    Expense getLastExpense();
    List<Expense> getAllExpenses();        
    List<Integer> getAllExpensesYears();
    DailyExpense calulateMaxMonthlyExpense(int month, int year);
    ArrayList<DailyExpense> calulateMonthlyExpenses(int month, int year);
    BigDecimal getThisWeekExpenditure();
}
