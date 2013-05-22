package eapli.expensemanager.presentation;


import eapli.expensemanager.controllers.GraphController;
import eapli.expensemanager.controllers.GraphModelViewer;
import eapli.util.Console;

public class Graph {
    private static String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public Graph(){};

    public void mainLoop(){
        int month = 0, year = 0;
        
        while(month < 1 && month > 12){
            month = Console.readInteger("");
        }
        year = Console.readInteger("");
        
        GraphController controller = new GraphController();
        GraphModelViewer ModelViewer = controller.graphModel(month, year);
        this.showGraph(ModelViewer); 
    }
    
    // Missing Conditon
    public void showGraph(GraphModelViewer ModelViewer){
        int i,j;
        int value = 0;
        
        
        System.out.println("Expenses for " + months[ModelViewer.month] + " of " + ModelViewer.year);
        System.out.print(" |");
        System.out.print(" |");
        for(i = 0; i < 9; i++)
            for(j = 0; j < ModelViewer.days; j++)
                value = ModelViewer.percentages[j][i];
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
        System.out.println("" + ModelViewer.maxExpense.getValue());
        System.out.print("_|");
        for(j = 0; j < ModelViewer.days; j++)
            value = ModelViewer.percentages[j][i];
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
        for(i = 0; i < ModelViewer.days; i++){
            if(i < 9){
                System.out.print("  " + (i+1) + "|");
            }else{
                System.out.print(" " + (i+1) + "|");
            }
        }
    };
}