package eapli.expensemanager.persistence;

import eapli.expensemanager.model.Cash;
import eapli.expensemanager.model.PaymentMeans;
import java.util.List;

public interface IPaymentMeansRepository {

    List<PaymentMeans> all();

    PaymentMeans save(PaymentMeans paymentMeans);

    Cash getCash(String currency);
}
