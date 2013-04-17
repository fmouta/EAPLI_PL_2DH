
package Presentation;

import eapli.util.Console;
import Controllers.ExpensesValueController;
import Model.Expense;
import Persistence.ExpensesRepository;
import Persistence.IExpensesRepository;
import java.math.BigDecimal;
import java.math.MathContext;

public class ExpensesValueUI {
    public void mainLoop()  {
        int option;
        BigDecimal totWeek,totMonth; 
        ExpensesValueController controller = new ExpensesValueController();
        MainMenu menu=new MainMenu();
        do {
        System.out.println("Show Total Expenses\n");
        System.out.println("1- This week");
        System.out.println("2- This month\n\n");
        System.out.println("0- Back to Menu\n");
        option = Console.readInteger("Select option...");
        switch (option) {
                case 0:
                    menu.mainLoop();
                    return;
                case 1:
                    totWeek = controller.getTotalWeek();
                    if(totWeek!=null){
                    System.out.println("\nThis week, you already spent "+totWeek.round(new MathContext(2))+" € counting all the expenses!");
                    } else {
                    System.out.println("\nThere are no expenses.");
                    }
                    break;
                case 2:
                    totMonth = controller.getTotalMonth();
                    if(totMonth!=null){
                    System.out.println("\nThis month, you already spent "+totMonth.round(new MathContext(2))+" € counting all the expenses!");
                    } else {
                    System.out.println("\nThere are no expenses.");
                    }
                    break;
                default:
                    System.out.println("\nInvalid Option\nPlease try again");
            }
      } while (option != 0);
        
       

    }
   } 
