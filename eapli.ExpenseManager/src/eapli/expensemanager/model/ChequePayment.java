
package eapli.expensemanager.model;

import javax.persistence.Entity;

@Entity
public class ChequePayment extends Payment {
    private String chequeNumber;

    public ChequePayment() {
    }
    
    public ChequePayment(Cheque paymentMeans, String chequeNumber) {
        super(paymentMeans);
        this.chequeNumber = chequeNumber;
    }
}
