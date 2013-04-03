/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.IncomeType;
import java.util.List;

/**
 *
 * @author i110422
 */
public interface IIncomeTypesRepository 
{
    public void save(IncomeType type);
    public List<IncomeType> getAllIncomeTypes();
}
