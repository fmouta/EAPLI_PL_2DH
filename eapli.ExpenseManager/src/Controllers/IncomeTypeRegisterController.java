package Controllers;
 
import Model.IncomeType;
import java.util.Date;
import Persistence.*;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class IncomeTypeRegisterController {

    public IncomeTypeRegisterController() {
    }

    public void registerIncomeType(String type) {
        IncomeType incomeType = new IncomeType(type);
        IIncomeTypesRepository repo = new IncomeTypesRepository();
        repo.save(incomeType);
    }    
}
