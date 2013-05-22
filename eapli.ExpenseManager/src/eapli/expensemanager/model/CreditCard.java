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
public class CreditCard extends Card {
    
    public CreditCard() {
    }
    public CreditCard(String cardName, String bank, String cardNumber, 
            String nameOnCard, Calendar validUntil) {
        super(cardName, bank, cardNumber, nameOnCard, validUntil);
    }
    
    @Override
    public String getDescription() {
        return "Credit Card " + getCardName();
    }
}
