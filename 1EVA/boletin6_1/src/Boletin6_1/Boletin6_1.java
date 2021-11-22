package Boletin6_1;

import java.util.Scanner;

public class Boletin6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la velocidad: ");
        int velocidad = sc.nextInt();
        System.out.println("Introduce la acelaración: ");
        int acelera = sc.nextInt();
        System.out.println("Introduce la frenada: ");
        int frena = sc.nextInt();

        coche obj1 = new coche();
        obj1.setVelocidad(velocidad);
        obj1.acelerar(acelera);
        obj1.frenar(frena);
    }
}
