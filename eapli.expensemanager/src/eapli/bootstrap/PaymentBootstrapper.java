/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;

import Model.Check;
import Model.CreditCard;
import Model.DebitCard;
import Model.PaymentType;
import Model.PaymentTypeEnum;
import Persistence.PaymentsRepository;

/**
 *
 * @author 1111314, 1111407
 */
public class PaymentBootstrapper {
    
     static {
       PaymentsRepository repo = new PaymentsRepository();
        repo.save(new DebitCard(12345, PaymentTypeEnum.DebitCard, "Bank1"));
        repo.save(new DebitCard(54321, PaymentTypeEnum.DebitCard, "Bank2"));
        repo.save(new CreditCard(67890, PaymentTypeEnum.CreditCard, "Bank3"));
        repo.save(new CreditCard(98765, PaymentTypeEnum.CreditCard, "Bank4"));
        repo.save(new Check(456789, PaymentTypeEnum.Check, "Bank5"));
        repo.save(new Check(68912, PaymentTypeEnum.Check, "Bank6"));
    }
    
}
