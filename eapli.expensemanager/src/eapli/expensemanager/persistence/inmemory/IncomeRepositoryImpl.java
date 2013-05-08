/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.persistence.inmemory;


import eapli.expensemanager.model.Income;
import eapli.expensemanager.persistence.IIncomeRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IncomeRepositoryImpl implements IIncomeRepository {

    private static List<Income> listIncome = new ArrayList<Income>();

    public IncomeRepositoryImpl() {
    }

    public Income save(Income i) {
        if (i == null) {
            throw new IllegalArgumentException();
        }
        listIncome.add(i);
        return i;

    }
    public List<Income> all(){
        return Collections.unmodifiableList(listIncome);
    }
}
