package Controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import Model.Expense;
import Model.ExpenseType;
import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;
import java.util.Calendar;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpensesRegisterController  extends BaseController {

    public ExpensesRegisterController() {
    }

    public void registerExpense(ExpenseType what, Calendar date, BigDecimal amount) {
        Expense expense = new Expense( what, date, amount);
        IExpensesRepository repo = new ExpensesRepository();
        repo.save(expense);
    }
    
}