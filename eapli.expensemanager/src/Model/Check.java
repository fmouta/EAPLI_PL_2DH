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
    
    public Check() {
    }

     public Check(int id_number, PaymentTypeEnum type, String bank) {
        super(id_number, type, bank);
    }
}
