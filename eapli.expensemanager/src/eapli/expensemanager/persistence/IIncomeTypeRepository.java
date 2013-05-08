package eapli.expensemanager.persistence;
 

import eapli.expensemanager.model.IncomeType;
import java.util.List;
/**
 *
 * @author 1110422
 */
public interface IIncomeTypeRepository {
    IncomeType save(IncomeType exp);
    List<IncomeType> all();        
}
