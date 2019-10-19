/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.Stateful;

/**
 *
 * @author snigd
 */
@Stateful
public class NewSessionBean implements NewSessionBeanLocal {

    private int balance;

    public NewSessionBean() {
        balance=0;
    }

    @Override
    public void withdraw(int amount) {
        balance-=amount;
    }

    @Override
    public void deposit(int amount) {
        balance+=amount;
    }

    @Override
    public Integer checkbalance() {
        return balance;
    }
    
    
}
