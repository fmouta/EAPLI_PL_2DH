package Presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Presentation.ExpenseRegisterUI;
import eapli.util.Console;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu {

    public void mainLoop() {
        int option;
        do {
            System.out.println("===================");
            System.out.println("  EXPENSE MANAGER  ");
            System.out.println("===================\n");

            System.out.println("1. Register an expense");
            System.out.println("2. Show last expense");
            System.out.println("3. Show all expenses");
            System.out.println("0. Exit\n\n");

            option = Console.readInteger("Please choose a option");
            switch (option) {
                case 0:
                    System.out.println("bye bye ...");
                    return;
                case 1:
                    ExpenseRegisterUI ui = new ExpenseRegisterUI();
                    ui.mainLoop();
                    break;
                case 2:
                    ExpensesUI ui2 = new ExpensesUI();
                    ui2.mainLoop();
                    break;
                case 3:
                    AllExpensesUI ui3 = new AllExpensesUI();
                    ui3.mainLoop();
                    break;
                case 4:
                    AllMonthlyExpensesUI ui4 = new AllMonthlyExpensesUI();
                    ui4.mainLoop();
                    break;
                case 5:
                    AllMonthlyExpensesTypeUI ui5 = new AllMonthlyExpensesTypeUI();
                    ui5.mainLoop();
                    break;
                default:
                    System.out.println("Invalid Option\nPlease try again");
            }
        } while (option != 0);
    }
}
