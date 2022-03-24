package com.edu.cesde;

import java.util.Scanner;

public class Product {
    private double price;
    private String name;
    private String reference;
    private String kindOfMeasure;
    double size;
    private String code;

    void setPrice(double price){
        Scanner inputData = new Scanner(System.in);
        System.out.println("ingrese el precio");
        if (price <= 10000000){
            this.price = price;
        }
        else{
            System.out.println("no se puede un precio mayor a 10 millones");
        }
    }
    double getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getKindOfMeasure() {
        return kindOfMeasure;
    }

    public void setKindOfMeasure(String kindOfMeasure) {
        this.kindOfMeasure = kindOfMeasure;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    void setCode(String code){

    }
    String getCode(){
        return this.code;
    }
}
