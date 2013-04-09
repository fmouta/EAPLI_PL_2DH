/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
import Model.PaymentType;
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
    
    public PaymentType getSelectedType(int option) {
        //A implementar
        return null;
    }
    
}
