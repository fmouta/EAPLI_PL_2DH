package Presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import Presentation.MainMenu;
import eapli.util.Math;
import Persistence.*;
import eapli.bootstrap.ExpensesBootstrapper;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpensesManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExpensesBootstrapper e = new ExpensesBootstrapper();
        MainMenu menu = new MainMenu();
        menu.mainLoop();
    }
}
