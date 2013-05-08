/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.persistence;


import eapli.expensemanager.model.Check;
import eapli.expensemanager.model.CreditCard;
import eapli.expensemanager.model.DebitCard;
import eapli.expensemanager.model.PaymentType;
import eapli.expensemanager.model.PaymentTypeEnum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 1111314, 1111407
 */
public class PaymentsRepository {
    
    // class member
    private static List<PaymentType> listPayments= new ArrayList<PaymentType>();
 
    public PaymentsRepository() {}
    
    public void save(PaymentType type)
    {
        if (type==null) throw new IllegalArgumentException();
        listPayments.add(type);  
    }    
    
    public List<PaymentType> getAllTypes()
    {
        return Collections.unmodifiableList(listPayments);
    }
    
    public List<PaymentType> getCreatedTypes() {
        return listPayments;
    }
    
    public PaymentType getSelectedType(int option) {
        PaymentType chosentype = listPayments.get(option);
        if(chosentype.getType() == PaymentTypeEnum.Check) {
            return (Check)chosentype;
        } else if(chosentype.getType() == PaymentTypeEnum.CreditCard) {
            return (CreditCard) chosentype;
        }
        return (DebitCard)chosentype;
    }
    
}
