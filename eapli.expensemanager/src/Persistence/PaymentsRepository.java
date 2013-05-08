/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentType;
import Model.CreditCard;
import Model.Check;
import Model.DebitCard;
import Model.PaymentTypeEnum;
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
