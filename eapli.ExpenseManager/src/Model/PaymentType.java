/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 1111314, 1111407
 */
public abstract class PaymentType {
    
    int id_number;

    public PaymentType() {
        id_number = 0;
    }

    public PaymentType(int id_number) {
        this.id_number = id_number;
    }
    
    public int getIdNumber() {
        return id_number;
    }
    
    public abstract boolean payExpenses(int mt);
    
}
