/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.persistence;

import eapli.expensemanager.model.Income;
import java.util.List;


//import eapli.expensemanager.model.Income;
//import java.util.List;

public interface IIncomeRepository {
    Income save(Income i);
    List<Income> all();
}
