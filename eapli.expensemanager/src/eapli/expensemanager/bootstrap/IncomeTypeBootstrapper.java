package eapli.expensemanager.bootstrap;


import eapli.expensemanager.model.Income;
import eapli.expensemanager.model.IncomeType;
import eapli.expensemanager.persistence.IIncomeRepository;
import eapli.expensemanager.persistence.IIncomeTypeRepository;
import eapli.expensemanager.persistence.PersistenceFactory;
import eapli.util.DateTime;
import java.math.BigDecimal;

/**
 *
 * @author 1090555
 */
public class IncomeTypeBootstrapper {

    static 
    {
        // IncomeType
        IIncomeTypeRepository repo = PersistenceFactory.
                buildPersistenceFactory().incomeTypeRepository();
        IncomeType salario = new IncomeType("Salário");
        IncomeType mesada = new IncomeType("Mesada");
        IncomeType servicos = new IncomeType("Prestação de Serviços");
        repo.save(salario);
        repo.save(mesada);
        repo.save(servicos);

        // Income
        IIncomeRepository repo2 = PersistenceFactory.buildPersistenceFactory().incomeRepository();
        Income salario1 = new Income("Vencimento Março 2013",DateTime.newDate(2013, 3, 1), new BigDecimal(200), salario);
        repo2.save(salario1); 
        }
}
