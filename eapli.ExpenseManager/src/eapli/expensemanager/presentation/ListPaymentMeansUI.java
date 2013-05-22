package eapli.expensemanager.presentation;

import eapli.expensemanager.controllers.BaseController;
import eapli.expensemanager.controllers.ExpenseController;
import eapli.expensemanager.model.PaymentMeans;
import java.util.List;

public class ListPaymentMeansUI extends BaseUI {

    private ExpenseController controller = new ExpenseController();

    public BaseController controller() {
        return controller;
    }
        
    public void run() {
        System.out.println("-- PAYMENT MEANS --");
        List<PaymentMeans> listPaymentMeans = controller.getPaymentMeans();

        for (int i = 0; i < listPaymentMeans.size(); i++) {
            System.out.println((i + 1) + ". " + 
                    listPaymentMeans.get(i).getDescription());
        }
    }
}
