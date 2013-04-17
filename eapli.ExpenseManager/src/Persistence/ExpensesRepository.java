package Persistence;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import Model.DailyExpense;
import Model.Expense;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import eapli.util.DateTime;
import java.util.Date;


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
    
    public List<Integer> getAllExpensesYears()
    {
        List<Integer> years = new ArrayList<>();
        
        boolean flag=false;
        for (Expense exp: listExpense) {
            if(!years.isEmpty()){
                for(int d: years){
                    if(exp.getDate().get(Calendar.YEAR)==d)
                        flag=true;
                }
                if(flag==false)
                    years.add(exp.getDate().get(Calendar.YEAR));
            }else{
               years.add(exp.getDate().get(Calendar.YEAR));
            }
            flag=false;
        }
        return years;
    }
        
    @Override
    public DailyExpense calulateMaxMonthlyExpense(int month, int year){
        ArrayList<DailyExpense> daily_expense_values = calulateMonthlyExpenses(month, year);
        DailyExpense maxExpenseValue = daily_expense_values.get(0);
        for(int i = 1; i < 31; i++){
            if(maxExpenseValue.equals(daily_expense_values.get(i))){
                maxExpenseValue = daily_expense_values.get(i);
            }
        }
        
        return maxExpenseValue;
    }
        
    @Override
    public ArrayList<DailyExpense> calulateMonthlyExpenses(int month, int year){
        /* Cannot Be Implemented */
        ArrayList<DailyExpense> daily_expense_values = new ArrayList();
        for(int i = 0; i < 31; i++){
            daily_expense_values.set(i, new DailyExpense(i+1, month, year, new BigDecimal(-1)));
        }
        DailyExpense adder;
        for (Iterator<Expense> it = listExpense.iterator(); it.hasNext();) {
            Expense e = it.next();
            if((e.getDate().get(Calendar.MONTH)== month) && (e.getDate().get(Calendar.YEAR) == year)){
                adder = daily_expense_values.get(e.getDate().get(Calendar.DAY_OF_MONTH)-1);
                adder.addValue(e.getAmount());
                daily_expense_values.set(e.getDate().get(Calendar.DAY_OF_MONTH)-1, adder);
            }
        }
        return daily_expense_values;
    }
    
    public BigDecimal getThisWeekExpenditure() {
        int weekNumber = DateTime.weekNumber(DateTime.today());
        BigDecimal expenditure = new BigDecimal(0);
        for (Expense exp: listExpense) {
            if (weekNumber == DateTime.weekNumber(exp.getDate()))
                expenditure = expenditure.add(exp.getAmount());
        }
        return expenditure;
    }
        
    public BigDecimal getThisMonthExpenditure() {
        int year = DateTime.currentYear();
        int month = DateTime.currentMonth();
        BigDecimal expenditure = new BigDecimal(0);
        for (Expense exp : listExpense) {
            if (year == exp.getDate().get(Calendar.YEAR)
                    && month == exp.getDate().get(Calendar.MONTH) + 1) {
                expenditure = expenditure.add(exp.getAmount());
            }
        }
        return expenditure;
    }
    
}
