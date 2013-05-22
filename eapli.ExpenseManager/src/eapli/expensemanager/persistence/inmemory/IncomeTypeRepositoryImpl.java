package eapli.expensemanager.persistence.inmemory;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.persistence.IIncomeTypeRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class IncomeTypeRepositoryImpl  implements IIncomeTypeRepository
{
    // class member
    private static List<IncomeType> listIncomeType= new ArrayList<IncomeType>();

    public IncomeTypeRepositoryImpl() {}
    
    public IncomeType save(IncomeType exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listIncomeType.add(exp); 
        return exp;
    }          
    
    public List<IncomeType> all()
    {
        return Collections.unmodifiableList(listIncomeType);
    }
}

