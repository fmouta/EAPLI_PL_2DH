
package eapli.expensemanager.model;

import javax.persistence.Entity;

/**
 *
 * @author 1111314, 1111407
 */

@Entity
public class Cheque extends PaymentMeans {
    private String bank;
    private String accountNumber;

    protected Cheque() {
    }

    public Cheque(String bank, String accountNumber) {
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    @Override
    public String getDescription() {
        return "Cheque from account " + accountNumber;
    }
}
