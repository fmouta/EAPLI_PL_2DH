package eapli.expensemanager;

import eapli.expensemanager.bootstrap.ExpensesBootstrapper;
import eapli.expensemanager.bootstrap.IncomeTypeBootstrapper;
import eapli.expensemanager.presentation.MainMenu;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExpenseManager {
    
    private static Properties applicationProperties = new Properties();
    
    public static Properties getApplicationProperties() {
        return applicationProperties;
    }
    
    private static void loadProperties() {
         try {
            applicationProperties.load(new FileInputStream(
                    "./src/eapli/expensemanager/expensemanager.properties"));
        } catch (IOException ex) {
            //default values
            applicationProperties.setProperty("persistence.repositoryFactory",
                    "eapli.expensemanager.persistence.JpaRepositoryFactory");

            ex.printStackTrace();
        }
    }

    private static void doBootstrap() {
        new ExpensesBootstrapper();
        new IncomeTypeBootstrapper();
    }
    
    public static void main(String[] args) {
        loadProperties();
        // call the bootstraper
        // the next line should be removed for "production" ready deployment
        doBootstrap();
        MainMenu menu = new MainMenu();
        menu.mainLoop();
    }

    
}
