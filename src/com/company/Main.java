package com.company;

import com.company.classes.*;


public class Main {
    public static void main(String[] args) {

        Bank homie = new Bank("Homie");
        Human human1 = new Human("Alex", "Fillipov", 35, 0);
        System.out.println(human1.toString());
        Customer cust1 = new Customer("Alex","Belsky",41,2204,0,1);
        cust1.setBalance(1500);
        System.out.println(cust1.getBalance());
        System.out.println(cust1.getAccID());
        cust1.openAcc();
        cust1.changeBalance(15);
        System.out.println(cust1.getBalance());
        homie.donation(150);
        System.out.println(homie.getBalance());

    }
}