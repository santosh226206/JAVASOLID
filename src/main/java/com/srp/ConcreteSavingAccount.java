package com.srp;

import com.srp.exception.AmountNotPresent;

public class ConcreteSavingAccount implements SavingAccount{
    private int amount;
    public ConcreteSavingAccount(int amount){
        this.amount=amount;
    }
    @Override
    public int withdraw(int amout) throws Exception {
        if(this.amount<amout){
            throw new AmountNotPresent("required amount is not present in account");
        }
        this.amount-=amout;
        return amout;
    }

    @Override
    public void deposit(int amount) {
        if(amount<0){
            System.out.println("invalid amount");
        }
        this.amount+=amount;
    }
}
