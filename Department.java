package com.company;

public class Department {
    String name;

    private int size;

    public Department(String name) {
        this.name = name;
    }

    public void getSize() {
        System.out.println("Численность отдела " + this.name + " равна " + size);
    }

    public int setSize(int num) {
        if (num < 0) {
            System.out.println("Численность не может быть отрицательной");
            return 0;
        }
        return size = num;
    }
}