package com.edu.cesde;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        double price;
        System.out.println("ingrese el precio del monitor ");
        price = inputData.nextDouble();
        Product monitorHp = new Product();
        monitorHp.name="monitor hp 24 full HD";
        monitorHp.setPrice(127250.99);
        monitorHp.setCode("SKU1020");
        monitorHp.setPrice(price);
        System.out.println("ingrese el precio de la cpu");
        double price2 = inputData.nextDouble();

        Product cpuHp = new Product();
        cpuHp.name = "cpu hp core i5";
        cpuHp.setPrice(price2);
        System.out.println("precio monitor: "+ monitorHp.getPrice());
        System.out.println("precio cpu: "+ cpuHp.getPrice());

        // write your code here

    }
}
