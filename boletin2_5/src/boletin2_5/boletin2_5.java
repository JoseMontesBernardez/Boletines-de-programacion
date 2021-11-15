package boletin2_5;

import java.util.Scanner;

public class boletin2_5 {
    public static void main(String[] args) {
        double millas_marinas;
        final double EQUIVALENCIA=1852;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las millas marinas: ");
        millas_marinas=sc.nextDouble();
        System.out.println(millas_marinas+" millas marinas son "+millas_marinas*EQUIVALENCIA+" metros");




    }
}
