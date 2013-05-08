/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Income;
import java.util.List;

public interface IIncomeRepository {
    void save(Income i);
    List<Income> getAllIncomes();
}
