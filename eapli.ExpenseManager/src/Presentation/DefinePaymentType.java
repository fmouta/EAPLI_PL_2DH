/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Model.PaymentType;
import eapli.util.Console;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1111314, 1111407
 */
public class DefinePaymentType {

    public DefinePaymentType definePaymentType() {

        System.out.println("\n Define Payment Type \n");
        int option = 0;
        List<PaymentType> listPayments= new ArrayList<PaymentType>();
        do {
            for (int i = 0; i < listPayments.size(); i++) {
                //verficar tipo pagamento para apresentar info ( cartao credito, debito, cheque)
                System.out.println(i+1 + listPayments.get(i).getIdNumber());
            }
            option = Console.readInteger("\nOption: ");
        } while (option <= 0 || option > listPayments.size());
        
        // return getSelectedType();
        
        return null; // 
    }
    
}
