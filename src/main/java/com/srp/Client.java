package com.srp;

public class Client {
    public static void main(String[] args) {
        SavingAccount a=new ConcreteSavingAccount(100);
        try {
            a.withdraw(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
