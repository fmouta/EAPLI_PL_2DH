/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.persistence.inmemory;


import eapli.expensemanager.model.Cash;
import eapli.expensemanager.model.PaymentMeans;
import eapli.expensemanager.persistence.IPaymentMeansRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1111314, 1111407
 */
public class PaymentMeansRepositoryImpl implements IPaymentMeansRepository {
    
    private static final List<PaymentMeans> paymentMeans = new ArrayList<PaymentMeans>();
    private static final Cash cashEur = new Cash(Cash.EUR);
    
    static {
        paymentMeans.add(cashEur);
    }
    
    @Override
    public List<PaymentMeans> all() {
        return paymentMeans;
    }

    @Override
    public PaymentMeans save(PaymentMeans paymentMeans) {
        // TODO check if we alreay know this object or add it if not
        this.paymentMeans.add(paymentMeans);
        return paymentMeans;
    }

    @Override
    public Cash getCash(String EUR) {
        return cashEur;
    }
    
}
