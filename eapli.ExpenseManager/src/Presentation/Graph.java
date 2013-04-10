package Presentation;

import Model.DailyExpense;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Graph {
    private static String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public Graph(){};
    
    // Missing Conditon
    public void showGraph(DailyExpense maxExpense, int days, int month, int year, ArrayList<DailyExpense> daily_expense_value, int[][] percentages){
        int i,j;
        int value = 0;
        
        
        System.out.println("Expenses for " + months[month] + " of " + year);
        System.out.print(" |");
        System.out.print(" |");
        for(i = 0; i < 9; i++)
            for(j = 0; j < days; j++)
                value = percentages[j][i];
                if(value == 0){
                    System.out.print("   |");
                }else if(value <= 25){
                    System.out.print(" ░ |");
                }else if(value <= 50){
                    System.out.print(" ▒ |");
                }else if(value <= 75){
                    System.out.print(" ▓ |");
                }else{
                    System.out.print(" █ |");
                }
        System.out.println("" + maxExpense.getValue());
        System.out.print("_|");
        for(j = 0; j < days; j++)
            value = percentages[j][i];
            if(value == 0){
                System.out.print("   |");
            }else if(value <= 25){
                System.out.print(" ░ |");
            }else if(value <= 50){
                System.out.print(" ▒ |");
            }else if(value <= 75){
                System.out.print(" ▓ |");
            }else{
                System.out.print(" █ |");
            }
        System.out.println("");
        System.out.print(" |");
        for(i = 0; i < days; i++){
            if(i < 9){
                System.out.print("  " + (i+1) + "|");
            }else{
                System.out.print(" " + (i+1) + "|");
            }
        }
    };
}