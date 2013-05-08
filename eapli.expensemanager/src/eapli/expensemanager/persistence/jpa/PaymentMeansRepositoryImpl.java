
package eapli.expensemanager.persistence.jpa;

import eapli.expensemanager.model.Cash;
import eapli.expensemanager.model.PaymentMeans;
import eapli.expensemanager.persistence.IPaymentMeansRepository;
import java.util.List;
import javax.persistence.Query;

public class PaymentMeansRepositoryImpl extends JpaRepository<PaymentMeans, Long> implements IPaymentMeansRepository {
    
    @Override
    public List<PaymentMeans> all() {
        return super.all();
    }

    @Override
    public PaymentMeans save(PaymentMeans paymentMeans) {
        return super.save(paymentMeans);
    }

    @Override
    public Cash getCash(String currency) {
        Query query = getEntityManager().createQuery(
                "SELECT c FROM Cash c WHERE c.currency = :curr");
        query.setParameter("curr", currency);
        Cash cash = (Cash)query.getSingleResult();
        return cash;
    }
}
