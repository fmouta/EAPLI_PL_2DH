package Persistence;
 
import Model.IncomeType;
import java.util.List;
/**
 *
 * @author 1110422
 */
public interface IIncomeTypesRepository {
    void save(IncomeType exp);
    List<IncomeType> getAllIncomeTypes();        
}
