//package ru.netology;

public class SavingsAccount extends Account {

    @Override
    public void pay(int amount) {
        System.out.println("Платеж со сберегательного счета невозможен");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (money < amount) {
            noMoney();
        } else {
            money -= amount;
            System.out.println("Выполнен перевод со сберегательного счета на сумму " + amount / 100 + " рублей");
        }
    }

    @Override
    public void addMoney(int amount) {
        money += amount;
        System.out.println("Сберегательный счет пополнен на сумму " + amount / 100 + " рублей");
    }
}