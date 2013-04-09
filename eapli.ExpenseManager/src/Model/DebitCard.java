/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 1111314, 1111407
 */
public class DebitCard extends PaymentType {

    private int sum;

    public DebitCard() {
        super();
        sum = 0;
    }

    public DebitCard(int number,int sum) {
        super(number);
        this.sum = sum;
    }

    @Override
    public boolean payExpenses(int mt) {
        if ((this.sum - mt) > 0) {
            return false;
        } else {
            this.sum -= mt;
        }
        return true;
    }

}
