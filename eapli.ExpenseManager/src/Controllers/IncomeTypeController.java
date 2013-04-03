/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.IncomeType;
import Persistence.IIncomeTypesRepository;

/**
 *
 * @author i110422
 */
public class IncomeTypeController 
{
    public void registerIncomeType(String desc)
    {
        IncomeType incType = new IncomeType(desc);
        /* IIncomeTypesRepository repo = new IIncomeTypesRepository(); 
        repo.save(incType); 
        
        COMPLETAR ISTO
        * 
        */
    }
}
