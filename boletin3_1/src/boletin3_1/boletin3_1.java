package boletin3_1;

import java.util.Scanner;

public class boletin3_1 {
    public static void main(String[] args) {
        double precio_tarifa, precio_compra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio de la tarifa");
        precio_tarifa=sc.nextDouble();

        System.out.println("Introduce el precio de la compra");
        precio_compra=sc.nextDouble();

        System.out.println("El descuento realizado es "+((precio_tarifa-precio_compra)*100)/precio_tarifa);


    }
}
