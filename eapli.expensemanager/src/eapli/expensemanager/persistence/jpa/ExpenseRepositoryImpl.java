
package eapli.expensemanager.persistence.jpa;

import eapli.expensemanager.model.Expense;
import eapli.expensemanager.persistence.IExpenseRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ExpenseRepositoryImpl extends JpaRepository<Expense, Long> implements IExpenseRepository {
    
//    Expense getLastExpense();
//    List<Expense> getAllExpenses();        
//    List<Integer> getAllExpensesYears();
//    DailyExpense calulateMaxMonthlyExpense(int month, int year);
//    ArrayList<DailyExpense> calulateMonthlyExpenses(int month, int year);
    
    public BigDecimal getThisWeekExpenditure() {
        int weekNumber = DateTime.weekNumber(DateTime.today());
        BigDecimal expenditure = new BigDecimal(0);
        for (Expense exp: listExpenses()) {
            if (weekNumber == DateTime.weekNumber(exp.getDate()))
                expenditure = expenditure.add(exp.getAmount());
        }
        return expenditure;
    }
        
    public BigDecimal getThisMonthExpenditure() {
        int year = DateTime.currentYear();
        int month = DateTime.currentMonth();
        BigDecimal expenditure = new BigDecimal(0);
        for (Expense exp : listExpenses()) {
            if ( year == DateTime.dateToCalendar(exp.getDate()).get(Calendar.YEAR)
                    && month == (DateTime.dateToCalendar(exp.getDate()).get(Calendar.MONTH) + 1)) {
                expenditure = expenditure.add(exp.getAmount());
            }
        }
        return expenditure;
    }
            
    private List<Expense> listExpenses() {
        return all();
    }

}
