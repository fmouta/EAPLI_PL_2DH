package eapli.expensemanager.controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 


import eapli.expensemanager.model.AccountServices;
import java.math.BigDecimal;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class BalanceController  extends BaseController {
    
    public BigDecimal getBalance() {
        AccountServices accountServices = new AccountServices();
        return accountServices.getBalance();
    }
        

}
