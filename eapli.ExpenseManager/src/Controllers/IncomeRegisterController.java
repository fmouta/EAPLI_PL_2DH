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
import java.util.List;

public class IncomeRegisterController {

    public IncomeRegisterController() {
    }

    public List<Income> registerIncome() {

        IIncomeRepository repo = new IncomeRepository();
        return repo.getAllIncomes();
    }
}
