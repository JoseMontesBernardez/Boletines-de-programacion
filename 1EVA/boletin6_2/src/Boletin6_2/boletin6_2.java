package Boletin6_2;

import java.util.Scanner;

public class boletin6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el meridiano: ");
        double meridiano = sc.nextDouble();
        System.out.println("Introduce el paralelo: ");
        double paralelo = sc.nextDouble();
        System.out.println("Introduce la distancia a la tierra: ");
        double disTerra = sc.nextDouble();

        satelite obj1 = new satelite();
        obj1.setMeridiano(meridiano);
        obj1.setParalelo(paralelo);
        obj1.setDisterra(disTerra);
        obj1.verPosicion();


    }
}
