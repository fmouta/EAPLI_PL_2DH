/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import java.util.Calendar;
import javax.persistence.Entity;

/**
 *
 * @author 1111314, 1111407
 */
@Entity
public class DebitCard extends Card {
    
    public DebitCard() {
    }

    public DebitCard(String cardName, String bank, String cardNumber, 
            String nameOnCard, Calendar validUntil) {
        super(cardName,bank, cardNumber, nameOnCard, validUntil);
    }

    @Override
    public String getDescription() {
        return "Debit Card " + getCardName();
    }
}
