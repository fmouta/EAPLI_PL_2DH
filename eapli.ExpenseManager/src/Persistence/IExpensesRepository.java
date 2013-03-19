package Persistence;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
import Model.Expense;
import Model.*;
import java.util.List;
/**
 *
 * @author losa
 */
public interface IExpensesRepository {
    void save(Expense exp);
  //  List<Expense> getAllExpenses();        
}
