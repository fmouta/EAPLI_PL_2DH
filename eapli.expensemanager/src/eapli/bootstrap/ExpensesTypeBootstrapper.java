/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import Persistence.IExpenseTypesRepository;

/**
 *
 * @author i111623
 */
public class ExpensesTypeBootstrapper {

    static {
        IExpenseTypesRepository repo = new ExpenseTypeRepository();
        repo.save(new ExpenseType("Autocarro"));
        repo.save(new ExpenseType("Almoço"));
        repo.save(new ExpenseType("Sapatilhas"));
    }
}
