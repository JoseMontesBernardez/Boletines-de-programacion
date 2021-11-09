package Boletin7_4;

import java.util.Scanner;

public class Boletin7_4 {
    public static void main(String[] args) {
        System.out.println("Introduce siguietes datos: ");
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el nombre de la 1ª persona: ");
        String nom1 = sc.next();
        System.out.println("Introduce el peso de la 1ª persona: ");
        float weight1 = sc.nextFloat();
        System.out.println("Introduce el nombre de la 2ª persona: ");
        String nom2 = sc.next();
        System.out.println("Introduce el peso de la 2ª persona: ");
        float weight2 = sc.nextFloat();

        Personas obj1 = new Personas ();
        obj1.Personas(nom1, nom2, weight1, weight2);
        obj1.compararPeso();
    }

}
