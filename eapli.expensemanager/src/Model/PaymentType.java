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

    private String bank;
    private int id_number;
    private PaymentTypeEnum type;

    public PaymentType() {
    }

    public PaymentType(int id_number, PaymentTypeEnum type, String bank) {
        this.id_number = id_number;
        this.type = type;
        this.bank = bank;
    }

    public PaymentTypeEnum getType() {
        return type;
    }
    
    public int getIDNumber() {
        return id_number;
    }
    
    public String getBank() {
        return bank;
    }
    
    public String toString() {
        return type + " : " + id_number + ", " + bank;
    }
}
