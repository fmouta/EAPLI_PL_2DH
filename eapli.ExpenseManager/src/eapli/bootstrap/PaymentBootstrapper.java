/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;

import Model.Check;
import Model.CreditCard;
import Model.DebitCard;
import Model.PaymentType;
import Persistence.PaymentsRepository;

/**
 *
 * @author 1111314, 1111407
 */
public class PaymentBootstrapper {
    
     static {
       PaymentsRepository repo = new PaymentsRepository();
        repo.save(new DebitCard(1234567, 200));
        repo.save(new CreditCard(8579243, 1000, 125));
        repo.save(new Check(347, 9854232));
    }
    
}
