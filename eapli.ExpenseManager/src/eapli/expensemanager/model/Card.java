package eapli.expensemanager.model;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Temporal;

@Entity
public abstract class Card extends PaymentMeans {
    private String cardName;
    private String bank;
    private String cardNumber;
    private String nameOnCard;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar validUntil;

    public Card() {
    }

    public Card(String cardName, String bank, String cardNumber,
            String nameOnCard, Calendar validUntil) {
        this.cardName = cardName;
        this.bank = bank;
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
        this.validUntil = validUntil;
    }

    public String getCardName() {
        return cardName;
    }
}
