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

   
    public CreditCard() {
    }

    public CreditCard(int id_number, PaymentTypeEnum type, String bank) {
        super(id_number, type, bank);
    }

}
