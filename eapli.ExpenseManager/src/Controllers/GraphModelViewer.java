package Controllers;

import Model.DailyExpense;
import java.util.ArrayList;

public class GraphModelViewer {
    public DailyExpense maxExpense;
    public int days;
    public int month;
    public int year;
    public ArrayList<DailyExpense> daily_expense_values;
    public int[][] percentages;
    
    GraphModelViewer(DailyExpense maxExpense, int days, int month, int year, ArrayList<DailyExpense> daily_expense_value, int[][] percentages){
      this.maxExpense = maxExpense;
      this.days = days;
      this.month = month;
      this.year = year;
      this.daily_expense_values = daily_expense_value;
      this.percentages = percentages;
    }

    GraphModelViewer() {

    }
}
