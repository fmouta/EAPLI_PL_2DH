/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Paulo Jorge
 */
public class CreditCard {
    
    private int number, limit, value;

    public CreditCard() {
        number = 0;
        limit = 0;
        value = 0;
    }

    public CreditCard(int number, int limit, int value) {
        this.number = number;
        this.limit = limit;
        this.value = value;
    }

    public boolean addToValue(int new_value) {
        if((this.value + new_value)> limit) { 
            return false;
        } else {
            this.value += new_value;
        }
        return true;
    }
    
    
    
}
