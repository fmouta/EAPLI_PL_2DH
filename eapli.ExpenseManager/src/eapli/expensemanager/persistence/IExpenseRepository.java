package eapli.expensemanager.persistence;
 

import eapli.expensemanager.model.Expense;
import java.math.BigDecimal;
import java.util.List;


public interface IExpenseRepository {
    Expense save(Expense exp);
//    Expense getLastExpense();
//    List<Expense> getAllExpenses();        
//    List<Integer> getAllExpensesYears();
//    DailyExpense calulateMaxMonthlyExpense(int month, int year);
//    ArrayList<DailyExpense> calulateMonthlyExpenses(int month, int year);
    BigDecimal getThisWeekExpenditure();
    BigDecimal getThisMonthExpenditure();
  
//    BigDecimal expenditureOfMonth(int year, int month);
//    BigDecimal expenditureOfWeek(int year, int weekNumber);
//    BigDecimal totalExpenditure();
//    List<Expense> between(Date start, Date end);
    List<Expense> all();
    
}
