package Persistence;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import Model.IncomeType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class IncomeTypesRepository  implements IIncomeTypesRepository
{
    // class member
    private static List<IncomeType> listIncomeType= new ArrayList<IncomeType>();

    public IncomeTypesRepository() {}
    
    public void save(IncomeType exp)
    {
        if (exp==null) throw new IllegalArgumentException();
        listIncomeType.add(exp);  
    }          
    
    public List<IncomeType> getAllIncomeTypes()
    {
        return Collections.unmodifiableList(listIncomeType);
    }
}

