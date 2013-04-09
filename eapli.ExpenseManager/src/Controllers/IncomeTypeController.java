package Controllers;

import Model.IncomeType;
import Persistence.IIncomeTypesRepository;
import Persistence.IncomeTypesRepository;
import java.util.List;
/**
 *
 * @author 1110422
 */
public class IncomeTypeController {

    public IncomeTypeController() {
    }
   
    public List<IncomeType> getAllIncomeTypes() {
        IIncomeTypesRepository repo = new IncomeTypesRepository();
        return repo.getAllIncomeTypes();
    }
    
}