/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;

import eapli.expensemanager.model.DailyExpense;
import eapli.expensemanager.persistence.inmemory.ExpenseRepositoryImpl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Tavares
 */
public class GraphController  extends BaseController {
    
    public GraphModelViewer graphModel(int month, int year){
        ExpenseRepositoryImpl repository = new ExpenseRepositoryImpl();
        GraphModelViewer ModelViewer = new GraphModelViewer();
//        ModelViewer.maxExpense = repository.calulateMaxMonthlyExpense(month, year);
//        ModelViewer.daily_expense_values = repository.calulateMonthlyExpenses(month, year);
//        ModelViewer.days = countDays(ModelViewer.daily_expense_values);
//        int[] locations = dayLocation(ModelViewer.daily_expense_values);
//        ModelViewer.percentages = calculatePercentages(ModelViewer.maxExpense, (ArrayList)ModelViewer.daily_expense_values, locations, ModelViewer.days);
//        ModelViewer.month = month;
//        ModelViewer.year = year;
        return ModelViewer;
    }
    
    
    private int countDays(List<DailyExpense> daily_expense_values){
        int days;
        for(days = 0; days < 31; days++){
            if(daily_expense_values.get(days).getValue() == new BigDecimal(-1))
                break;
        }
        return days;
    }
    
    private int[] dayLocation(List<DailyExpense> daily_expense_values){
        int[] location = new int[31];
        
        for(int i = 0; i < 31; i++){
            location[daily_expense_values.get(i).getDay()-1] = i; 
        }
        
        return location;
    }
    
    private int[][] calculatePercentages(DailyExpense maxExpense, ArrayList<DailyExpense> daily_expense_value, int[] locations, int days){
        int[][] percentages = new int[31][10];
        
        int i,j;
        int current_day;
        BigDecimal tenth_piece = maxExpense.getValue().divide(BigDecimal.TEN);
        int full_pieces;
        int total_pieces;
        BigDecimal full_value;
        
        for(i = 0; i < days; i++){
            current_day = locations[i];
            if(maxExpense.getValue().equals(daily_expense_value.get(current_day).getValue()))
                 for(j = 0; j < 10; j++)
                    percentages[i][j] = 100;
            else if(daily_expense_value.get(current_day).getValue().intValue() == 0)
                 for(j = 0; j < 10; j++)
                    percentages[i][j] = 0;
            else{
                full_pieces = 0;
                full_value = daily_expense_value.get(current_day).getValue();
                for(j = 0; j < 10; j++){
                    full_value.subtract(tenth_piece);
                    if(full_value.compareTo(BigDecimal.ZERO) == -1){
                        full_value.add(tenth_piece);
                        break;
                    }
                    full_pieces++;
                }
                total_pieces = full_pieces + 1;
                for(j = 0; j < 10-total_pieces; j++){
                    percentages[current_day][j] = 0;
                }
                percentages[current_day][j] = full_value.multiply(new BigDecimal(100)).divide(tenth_piece).intValue();
                for(j = j+1; j < 10; j++){
                    percentages[current_day][j] = 100;
                }
            }
        }
        
        return percentages;
    }
}
