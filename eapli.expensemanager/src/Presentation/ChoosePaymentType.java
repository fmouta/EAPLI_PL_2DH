/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Model.PaymentType;
import eapli.util.Console;
import java.util.List;
import Controllers.PaymentTypeController;

/**
 *
 * @author 1111314, 1111407
 */
public class ChoosePaymentType {

    public void definePaymentType() { // Quem registar devera retornar o objecto escolhido em 1

        System.out.println("\n Choose Payment Type \n");
        int option = 0;
       PaymentTypeController repo_controller = new PaymentTypeController();
        List<PaymentType> possibleListPayments = repo_controller.getAllPaymentTypes();
        do {
            for (int index = 0; index < possibleListPayments.size(); index++) {
                System.out.println(possibleListPayments.get(index).getClass());
                //System.out.println(i+1 + listPayments.get(i).getIdNumber());
            }
            option = Console.readInteger("\nOption: ");
        } while (option <= 0 || option > possibleListPayments.size());

        //1) return repo.getSelectedType(option);
    }
}
