//package ru.netology;

public class CreditAccount extends Account {

    @Override
    public void pay(int amount) {
        money -= amount;
        System.out.println("Выполнен платеж с кредитного счета на сумму " + amount / 100 + " рублей");
    }

    @Override
    public void transfer(Account account, int amount) {
        money -= amount;
        System.out.println("Выполнен перевод со сберегательного счета на сумму " + amount / 100 + " рублей");
    }

    @Override
    public void addMoney(int amount) {
        if (money + amount > 0) {
            System.out.println("Нельзя пополнить на сумму, превышающую сумму кредита");
        } else
            money += amount;
    }
}


