/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 1111314, 1111407
 */
public class Check extends PaymentType {
    
    private int value;

    public Check() {
        super();
        value = 0;
    }

    public Check(int value, int number) {
        super(number);
        this.value = value;
    }
    
    public boolean payExpenses(int mt) {
        value = 0;
        return true;
    }
    
}
