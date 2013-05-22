/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.bootstrap;

import eapli.expensemanager.model.*;
import eapli.expensemanager.persistence.IPaymentMeansRepository;
import eapli.expensemanager.persistence.PersistenceFactory;
import eapli.util.DateTime;

/**
 *
 * @author 1081344, 1091330 , 1091436
 */
public class PaymentBootstrapper {

    static {

        //  PaymentMeans
        IPaymentMeansRepository repo = PersistenceFactory.
                buildPersistenceFactory().paymentMeansRepository();
        PaymentMeans CreditCard =
                new CreditCard("Millennium bcp Classic", "Millennium bcp", "56789", "João Gomes", DateTime.newCalendarDate(2013, 5, 15));
        PaymentMeans DebitCard =
                new DebitCard("Cartão Ferrari", " Santander Totta", "12345", "Eduardo Ferreira", DateTime.newCalendarDate(2013, 2, 10));
        PaymentMeans Cash = new Cash("EUR");
        PaymentMeans Cheque = new Cheque("CGD", "13579");

//        PaymentMeans pCreditCard = new CreditCard("VISA", "CGD", "56789",
//                "José Silva", DateTime.newCalendarDate(2014, 4, 1));
//        PaymentMeans pDebitCard = new DebitCard("Caixazul", "CGD", "12345",
//                "José Silva", DateTime.newCalendarDate(2015, 1, 1));
//        PaymentMeans pCash = new Cash("EUR");
//        PaymentMeans pCheque = new Cheque("CGD", "13579");

        repo.save(CreditCard);
        repo.save(DebitCard);
        repo.save(Cash);
        repo.save(Cheque);

    }
}
