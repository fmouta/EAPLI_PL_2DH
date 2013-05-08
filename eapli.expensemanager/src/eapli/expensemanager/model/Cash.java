package eapli.expensemanager.model;

import javax.persistence.Entity;

@Entity
public class Cash extends PaymentMeans {
    public static final String EUR = "EUR";
    private String currency;
    
    public Cash() {
    }

    public Cash(String currency) {
        this.currency = currency;
    }

    @Override
    public String getDescription() {
        return "Cash " + currency;
    }
}
