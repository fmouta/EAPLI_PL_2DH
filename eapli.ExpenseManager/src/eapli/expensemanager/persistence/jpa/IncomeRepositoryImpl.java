package eapli.expensemanager.persistence.jpa;

import eapli.expensemanager.model.Income;
import eapli.expensemanager.persistence.IIncomeRepository;

public class IncomeRepositoryImpl extends JpaRepository<Income, Long> implements IIncomeRepository {
    
}
