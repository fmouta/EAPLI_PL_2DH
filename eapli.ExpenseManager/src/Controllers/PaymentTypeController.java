/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.PaymentType;
import Persistence.PaymentsRepository;
import java.util.List;

/**
 *
 * @author Paulo Jorge
 */
public class PaymentTypeController {

    public PaymentTypeController() {
    }

    public List<PaymentType> getAllPaymentTypes() {
        PaymentsRepository repo = new PaymentsRepository();
        return repo.getCreatedTypes();
    }
}
