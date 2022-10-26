package com.company.classes;

public class Bank {
    String name;
    private int balance;

    public static int Id_Number = 1;

    public Bank(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setBalance(float balance) {
        this.balance = (int) balance;
    }

    public int donation(int money){     //Пожертвования
        if(money <= 0){
            System.out.println("Пожертвование должно быть положительным числом");
            return 0;
        }
        return this.balance += money;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
