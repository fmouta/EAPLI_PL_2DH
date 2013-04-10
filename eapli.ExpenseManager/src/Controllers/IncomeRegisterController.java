/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Model.IncomeType;
import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;
import java.util.Calendar;

public class IncomeRegisterController {

    public IncomeRegisterController() {
    }

    public void registerIncome(IncomeType what, Calendar date, BigDecimal amount) {
        Income income = new Income(what, date, amount);
        IIncomeRepository repo = new IncomeRepository();
        repo.save(income);
    }
}
