/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.IncomeType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i110422
 */
public class IncomeTypesRepository 
{
    private static List<IncomeType> listIncomeTypes = new ArrayList<IncomeType>();
    public void save(IncomeType type)
    {
        if(type == null)
            throw new IllegalArgumentException();
        listIncomeTypes.add(type);
    }
}
