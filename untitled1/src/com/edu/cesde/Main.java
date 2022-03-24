package com.edu.cesde;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        double price;
        Product monitorHp = new Product();
        monitorHp.setPrice();
        Product cpuHp.setPrice();

        double price2 = inputData.nextDouble();

        Product cpuHp = new Product();
        cpuHp.name = "cpu hp core i5";
        cpuHp.setPrice(price2);
        System.out.println("precio monitor: "+ monitorHp.getPrice());
        System.out.println("precio cpu: "+ cpuHp.getPrice());

        // write your code here

    }
}
