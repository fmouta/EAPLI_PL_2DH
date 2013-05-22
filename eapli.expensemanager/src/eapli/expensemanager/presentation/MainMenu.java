package eapli.expensemanager.presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import eapli.expensemanager.presentation.RegisterExpenseUI;
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
            System.out.println("4. Show monthly expenses");
            System.out.println("5. Show monthly expenses aggregated by type");
            System.out.println("6. Show expenses(week/month)");
            System.out.println("7. List expense types");
            System.out.println("8. List payment means");
            System.out.println("9. Register income type");
            System.out.println("10. List income types");
            System.out.println("11. Show Balance");
            System.out.println("12. Register an income");
            System.out.println("13. Show all incomes");
            System.out.println("0. Exit\n\n");

            option = Console.readInteger("Please choose a option");
            switch (option) {
                case 0:
                    System.out.println("bye bye ...");
                    return;
                case 1:
                    RegisterExpenseUI ui = new RegisterExpenseUI();
                    ui.mainLoop();
                    break;
                case 2:
                    ExpensesUI ui2 = new ExpensesUI();
                    ui2.mainLoop();
                    break;
                case 3:
                    ListExpensesUI ui3 = new ListExpensesUI();
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
                case 6:
                    ExpensesValueUI ui6 = new ExpensesValueUI();
                    ui6.mainLoop();
                    break;
                case 7:
                    ListExpenseTypesUI listExpensesTypesUI = new ListExpenseTypesUI();
                    listExpensesTypesUI.mainLoop();
                    break;
                case 8:
                    ListPaymentMeansUI listPaymentMeansUI = new ListPaymentMeansUI();
                    listPaymentMeansUI.mainLoop();
                    break;
                case 9:
                    RegisterIncomeTypeUI ui7 = new RegisterIncomeTypeUI();
                    ui7.mainLoop();
                    break;
                case 10:
                    ListIncomeTypesUI listIncomeTypesUI = new ListIncomeTypesUI();
                    listIncomeTypesUI.mainLoop();
                    break;
                case 11:
                    ShowBalanceUI showBalanceUI = new ShowBalanceUI();
                    showBalanceUI.mainLoop();
                    break;
                case 12:
                    RegisterIncomeUI ui8 = new RegisterIncomeUI();
                    ui8.mainLoop();
                    break;
                case 13:
                    ListIncomesUI ui9 = new ListIncomesUI();
                    ui9.mainLoop();
                default:
                    System.out.println("Invalid Option\nPlease try again");
            }
        } while (option != 0);
    }
}
