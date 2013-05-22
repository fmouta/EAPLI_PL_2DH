package eapli.expensemanager.bootstrap;

import eapli.expensemanager.model.Cash;
import eapli.expensemanager.model.Cheque;
import eapli.expensemanager.model.CreditCard;
import eapli.expensemanager.model.DebitCard;
import eapli.expensemanager.model.Expense;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.Payment;
import eapli.expensemanager.model.PaymentMeans;
import eapli.expensemanager.persistence.IExpenseRepository;
import eapli.expensemanager.persistence.IExpenseTypeRepository;
import eapli.expensemanager.persistence.IPaymentMeansRepository;
import eapli.expensemanager.persistence.PersistenceFactory;
import eapli.util.DateTime;
import java.math.BigDecimal;

/**
 *
 * @author 1111314, 1111407
 */
public class ExpensesBootstrapper {

    static {
        
        //  ExpenseType        
        IExpenseTypeRepository repo = PersistenceFactory.buildPersistenceFactory().expenseTypeRepository();
        ExpenseType transportes = new ExpenseType("Transportes");
        ExpenseType alimentacao = new ExpenseType("Alimentação");
        ExpenseType vestuario = new ExpenseType("Vestuário");
        repo.save(transportes);
        repo.save(alimentacao);
        repo.save(vestuario);
        
        //  PaymentMeans
        IPaymentMeansRepository repo2 = PersistenceFactory.
                buildPersistenceFactory().paymentMeansRepository();
        PaymentMeans pCreditCard = new CreditCard("VISA", "CGD", "56789",
                "José Silva", DateTime.newCalendarDate(2014, 4, 1));
        PaymentMeans pDebitCard = new DebitCard("Caixazul", "CGD", "12345",
                "José Silva", DateTime.newCalendarDate(2015, 1, 1));
        PaymentMeans pCash = new Cash(Cash.EUR);
        PaymentMeans pCheque = new Cheque("CGD", "13579");
        repo2.save(pCreditCard);
        repo2.save(pDebitCard);
        repo2.save(pCash);
        repo2.save(pCheque);
        
        //  Expense
        IExpenseRepository repo3 = PersistenceFactory.
                buildPersistenceFactory().expenseRepository();     
        Expense exp = new Expense(vestuario, "Sapatilhas",
                DateTime.newDate(2013, 5, 14), new BigDecimal(150),
                new Payment(pCreditCard));
        repo3.save(exp);
        exp = new Expense(vestuario, "T-shirt", DateTime.newDate(2013, 4, 1),
                new BigDecimal(10), new Payment(pDebitCard));
        repo3.save(exp);
        exp = new Expense(transportes, "Autocarro",
                DateTime.newDate(2013, 3, 1), new BigDecimal(35),
                new Payment(pCash));
        repo3.save(exp);
    }
}
