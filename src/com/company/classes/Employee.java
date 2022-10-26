package com.company.classes;

public class Employee extends Human {
    private int salary;
    private String department;
    private int balance;
    private int accID;

    public Employee(String firstName, String lastName, int age, int documentId, int salary, String department, int balance, int accID) {
        super(firstName, lastName, age, documentId);
        this.salary = salary;
        this.department = department;
        this.balance = balance;
        this.accID = accID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", department='" + department + '\'' +
                ", balance=" + balance +
                ", accID=" + accID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", documentId=" + documentId +
                '}';
    }
}
