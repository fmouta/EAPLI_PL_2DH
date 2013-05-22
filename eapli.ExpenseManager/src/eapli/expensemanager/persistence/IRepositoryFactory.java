package eapli.expensemanager.persistence;

public interface IRepositoryFactory {

    IExpenseRepository expenseRepository();

    IExpenseTypeRepository expenseTypeRepository();
    
    IIncomeRepository incomeRepository();

    IIncomeTypeRepository incomeTypeRepository();
    
    IPaymentMeansRepository paymentMeansRepository();
    
}
