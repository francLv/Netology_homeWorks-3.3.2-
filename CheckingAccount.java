//package ru.netology;

public class CheckingAccount extends Account {

    @Override
    public void pay(int amount) {
        if (money < amount) {
            noMoney();
        } else {
            money -= amount;
            System.out.println("Выполнен платеж с расчетного счета на сумму " + amount / 100 + " рублей");
        }

    }

    @Override
    public void transfer(Account account, int amount) {
        if (money < amount) {
            noMoney();
        } else {
            money -= amount;
            System.out.println("Выполнен перевод с расчетного счета на сумму " + amount / 100 + " рублей");
        }
    }

    @Override
    public void addMoney(int amount) {
        money += amount;
        System.out.println("Расчетный счет пополнен на сумму " + amount / 100 + " рублей");
    }
}

