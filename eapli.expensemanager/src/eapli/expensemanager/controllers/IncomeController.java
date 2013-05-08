/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.controllers;



import eapli.expensemanager.model.Income;
import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.persistence.IIncomeRepository;
import eapli.expensemanager.persistence.IIncomeTypeRepository;
import eapli.expensemanager.persistence.PersistenceFactory;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class IncomeController extends BaseController {
    
    public void registerIncomeType(String descr) {
        IncomeType incomeType = new IncomeType(descr);
        IIncomeTypeRepository repo = PersistenceFactory.buildPersistenceFactory().incomeTypeRepository();
        repo.save(incomeType);
    }

    public void registerIncome(String what, Date date, BigDecimal amount, IncomeType type) {
        Income income = new Income(what, date, amount, type);
        IIncomeRepository repo = PersistenceFactory.buildPersistenceFactory().incomeRepository();
        repo.save(income);
    }

    public List<IncomeType> getIncomeTypes() {
        IIncomeTypeRepository repo = PersistenceFactory.buildPersistenceFactory().incomeTypeRepository();
        return repo.all();
    }
    
    public List<Income> getIncomes() {
        IIncomeRepository repo = PersistenceFactory.buildPersistenceFactory().incomeRepository();
        return repo.all();
    }
}
