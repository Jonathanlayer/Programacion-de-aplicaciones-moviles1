package com.company;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        // write your code here
        Scanner inputData = new Scanner(System.in);
        int Num, numPares, CantPares=0;
        System.out.println("Ingrese el numero: ");
        Num = inputData.nextInt();
        for (int i=1;i<=Num;i++)
        {
            if (i % 2==0){
                numPares = i;
                System.out.println(numPares);
                CantPares = CantPares +1;
            }
        }
        System.out.println("La cantidad de pares es: "+CantPares);

    }
}