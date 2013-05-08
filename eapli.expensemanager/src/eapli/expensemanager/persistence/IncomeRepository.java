/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.persistence;


import eapli.expensemanager.model.Income;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IncomeRepository implements IIncomeRepository {

    private static List<Income> listIncome = new ArrayList<Income>();

    public IncomeRepository() {
    }

    public void save(Income i) {
        if (i == null) {
            throw new IllegalArgumentException();
        }
        listIncome.add(i);

    }
    public List<Income>getAllIncomes(){
        return Collections.unmodifiableList(listIncome);
    }
}
