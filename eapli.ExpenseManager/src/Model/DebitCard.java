/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class DebitCard {
    
    private int sum, number;

    public DebitCard() {
        sum = 0;
        number = 0;
    }

    public DebitCard(int sum, int number) {
        this.sum = sum;
        this.number = number;
    }
    
    public boolean takeMoney(int mt) {
        if((this.sum - mt)> 0) { 
            return false;
        } else {
            this.sum -= mt;
        }
        return true;
    }
    
}
