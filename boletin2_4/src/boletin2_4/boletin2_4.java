package boletin2_4;

import java.util.Scanner;

public class boletin2_4 {
    public static void main(String[] args) {
        float numero1,numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Teclea el primer numero: ");
        numero1=sc.nextFloat();
        System.out.println("Teclea el segundo numero: ");
        numero2=sc.nextFloat();

        System.out.println("La suma es: "+(numero1+numero2));
        System.out.println("La resta es: "+(numero1-numero2));
        System.out.println("El producto es: "+(numero1*numero2));
        System.out.println("El occiente es: "+(numero1/numero2));


    }
}
