
package eapli.expensemanager.persistence.jpa;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.persistence.IExpenseRepository;
import java.math.BigDecimal;

public class ExpenseRepositoryImpl extends JpaRepository<Expense, Long> implements IExpenseRepository {
    
//    Expense getLastExpense();
//    List<Expense> getAllExpenses();        
//    List<Integer> getAllExpensesYears();
//    DailyExpense calulateMaxMonthlyExpense(int month, int year);
//    ArrayList<DailyExpense> calulateMonthlyExpenses(int month, int year);
    public BigDecimal getThisWeekExpenditure() {
        return new BigDecimal(0);
    }
    public BigDecimal getThisMonthExpenditure() {
        return new BigDecimal(0);
    }
    
}
