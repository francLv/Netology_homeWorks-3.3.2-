//package ru.netology;

public abstract class Account {
    protected int money;

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);

    public void noMoney() {
        System.out.println("Недостаточно среств для операции");
    }

}
