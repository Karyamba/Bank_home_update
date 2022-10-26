package com.company.classes;

public class Customer extends Human {
    private int balance;
    private int accID;
    protected boolean accExist = false;     // По умолчанию у покупателя нет счета

    public Customer(String firstName, String lastName, int age, int documentId,
                    int balance, int accID) {
        super(firstName, lastName, age, documentId);
        this.balance = balance;
        this.accID = accID;

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public boolean openAcc(){           //Открытие счета
        return accExist = true;
    }

    public boolean closeAcc(){          //Закрытие счета
        return accExist = false;
    }


    public int changeBalance(int balance){ //Изменение баланса
        if (!accExist)
        {
            System.out.println("У вас не открыт счет");
            return 0;
        }
        else {
            return this.balance += balance;
        }
    }



    @Override
    public String toString() {
        return "Customer{" +
                "balance=" + balance +
                ", accID=" + accID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", documentId=" + documentId +
                '}';
    }
}
