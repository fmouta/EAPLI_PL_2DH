
package Controllers;

import Model.Expense;
import java.math.BigDecimal;
import Persistence.IExpensesRepository;
import Persistence.ExpensesRepository;
import eapli.util.DateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseController {
    
    /**
     * gets the expenditure of the current week
     */
    public BigDecimal getThisWeekExpenditure() {
        IExpensesRepository repo = new ExpensesRepository();
        return repo.getThisWeekExpenditure();
    }
    
    /**
     * gets the expenditure of the current week
     */
    public BigDecimal getThisMonthExpenditure() {
        IExpensesRepository repo = new ExpensesRepository();
        return repo.getThisMonthExpenditure();
    }
    
}
