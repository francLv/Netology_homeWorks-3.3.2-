//package ru.netology;

public class Main {

    public static void main(String[] args) {

        Account[] accounts = new Account[3];
        accounts[0] = new CheckingAccount();
        accounts[1] = new SavingsAccount();
        accounts[2] = new CreditAccount();

        for (Account account : accounts) {
            account.addMoney(300_00);
            account.pay(200_00);
            account.transfer(account, 200_00);
            account.addMoney(500_00);
            account.transfer(account, 200_00);
            System.out.println();
        }

    }
}
