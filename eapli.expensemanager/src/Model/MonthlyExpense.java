/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controllers.ExpensesController;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author user
 */
public class MonthlyExpense {

    private int year;
    private int month;
    private BigDecimal value=new BigDecimal(0);

    public MonthlyExpense() {
    }

    public MonthlyExpense(int y, int m, BigDecimal v) {
        year = y;
        month = m;
        value = v;
    }

    public MonthlyExpense getMonthlyExpense(int y, int m) {

        this.year = y;
        this.month = m;
        ExpensesController controller = new ExpensesController();
        List<Expense> list = controller.getAllExpenses();
        for (Expense exp : list) {
            if (exp.getDate().get(Calendar.YEAR) == y) {
                if (exp.getDate().get(Calendar.MONTH) == m) {
                    this.value=this.value.add(exp.getAmount());
                }
            }
        }
        return this;
    }

    public MonthlyExpense getMonthlyExpenseType(int y, int m, ExpenseType expt) {

        this.year = y;
        this.month = m;
        ExpensesController controller = new ExpensesController();
        List<Expense> list = controller.getAllExpenses();
        for (Expense exp : list) {
            if (exp.getDate().get(Calendar.YEAR) == y) {
                if (exp.getDate().get(Calendar.MONTH) == m) {
                    if(exp.getDescription().getDescription().compareTo(expt.getDescription())==0)
                        this.value=this.value.add(exp.getAmount());
                }
            }
        }
        return this;
    }
    
    public String toString() {
        return "Year " + year + "\nMonth " + month + "\nExpense " + value.setScale( 2, BigDecimal.ROUND_HALF_UP)+ "€";
    }
    
    public BigDecimal getValue(){
        return value;
    }
}
