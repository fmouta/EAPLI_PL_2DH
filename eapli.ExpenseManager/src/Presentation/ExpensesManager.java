package Presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import Presentation.MainMenu;
import eapli.util.Math;
import Persistence.*;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpensesManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainMenu menu = new MainMenu();
        menu.mainLoop();
    }
}
