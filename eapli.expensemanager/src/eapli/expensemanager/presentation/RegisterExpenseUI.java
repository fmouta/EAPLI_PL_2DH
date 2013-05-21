package eapli.expensemanager.presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ExpenseController;
import eapli.expensemanager.model.ExpenseType;
import eapli.expensemanager.model.Payment;
import eapli.expensemanager.model.PaymentMeans;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
class RegisterExpenseUI  extends BaseUI {
      
    private ExpenseController controller = new ExpenseController();

    public BaseController controller() {
        return controller;
    }
    
    public void run() {
        String what = Console.readLine("What:");
        Date date = Console.readDate("When (dd-MM-yyyy):");
        double value = Console.readDouble("How much:");
        BigDecimal amount = new BigDecimal(value);
        ExpenseType expenseType = readExpenseType();
        PaymentMeans paymentMeans = readPaymentMeans();

        controller.registerExpense(what, date, amount, expenseType,
                new Payment(paymentMeans));
        System.out.println("\nExpense recorded!");
    }
        
    private ExpenseType readExpenseType() {
        System.out.println("-- EXPENSE TYPES --");
        List<ExpenseType> listExpenseTypes = controller.getExpenseTypes();

        for (int i = 0; i < listExpenseTypes.size(); i++) {
            System.out.println((i+1) + ". " + listExpenseTypes.get(i));  
        }
        int option = Console.readOption(1, listExpenseTypes.size(), 0);
        
        ExpenseType expenseType = listExpenseTypes.get(option-1);
        return expenseType;
    }   
    
    private PaymentMeans readPaymentMeans() {
        System.out.println("-- PAYMENT MEANS --");
        List<PaymentMeans> listPaymentMeans = controller.getPaymentMeans();

        for (int i = 0; i < listPaymentMeans.size(); i++) {
            System.out.println((i + 1) + ". " + 
                    listPaymentMeans.get(i).getDescription());
        }
        int option = Console.readOption(1, listPaymentMeans.size(), 0);
        
        PaymentMeans paymentMeans = listPaymentMeans.get(option-1);
        return paymentMeans;
    }
     /**
     *
     * @author 1081344, 1091330 , 1091436 
     */
    // Alternativa
    private PaymentMeans readPaymentMeans2() {

        List<PaymentMeans> listp = controller.getPaymentMeans();
        int optionp;
        do {
            System.out.println("===================");
            System.out.println(" Choose PaymentType ");
            System.out.println("===================\n");
            for (int i = 0; i < listp.size(); i++) {
                System.out.println((i + 1) + ":" + listp.get(i).toString());
            }
            optionp = Console.readInteger("Please choose a option");
        } while (optionp > listp.size() || optionp < 1);
        PaymentMeans paymentMeans = listp.get(optionp - 1);
        return paymentMeans;

    }
    
}
