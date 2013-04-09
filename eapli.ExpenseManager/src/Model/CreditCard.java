/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 1111314, 1111407
 */
public class CreditCard extends PaymentType {

    private int limit, value;

    public CreditCard() {
        super();
        limit = 0;
        value = 0;
    }

    public CreditCard(int number, int limit, int value) {
        super(number);
        this.limit = limit;
        this.value = value;
    }

    @Override
    public boolean payExpenses(int new_value) {
        if ((this.value + new_value) > limit) {
            return false;
        } else {
            this.value += new_value;
        }
        return true;
    }
}
