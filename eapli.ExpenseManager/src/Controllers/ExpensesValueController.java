
package Controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Persistence.ExpensesRepository;
import Persistence.IExpensesRepository;
import java.math.BigDecimal;



public class ExpensesValueController {

    public ExpensesValueController() {
    }

    public BigDecimal getTotalWeek() {
        IExpensesRepository repo = new ExpensesRepository();
        return repo.getTotalWeek();
    }
    
    public BigDecimal getTotalMonth()  {
        IExpensesRepository repo = new ExpensesRepository();
        return repo.getTotalMonth();
    }
    
}
