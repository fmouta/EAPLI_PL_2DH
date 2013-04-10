package eapli.bootstrap;

import Model.IncomeType;
import Persistence.IncomeTypesRepository;
import Persistence.IIncomeTypesRepository;

/**
 *
 * @author 1090555
 */
public class IncomeTypeBootstrapper {

    static {
        IIncomeTypesRepository repo = new IncomeTypesRepository();
        repo.save(new IncomeType("Salário"));
        repo.save(new IncomeType("Mesada"));
        repo.save(new IncomeType("Prestação de Serviços"));
    }
}
