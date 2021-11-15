package boletin3_2;

import java.util.Scanner;

public class boletin3_2 {
    public static void main(String[] args) {
        double celsius;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los grados celsius que quiere convertir");
        celsius=sc.nextDouble();

        System.out.println(celsius+" grados celsius son "+(celsius+273.13)+ " grados kelvin");
        System.out.println(celsius+ "grados celsius son "+((celsius* 9 / 5) + 32)+" grados fahrenheit");



    }
}
