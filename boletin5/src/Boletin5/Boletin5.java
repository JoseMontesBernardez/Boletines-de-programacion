package Boletin5;

import java.util.Scanner;

public class Boletin5 {
    public static void main(String[] args) {
        System.out.println("Ingrese los datos correspondientes ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los kilometros");
        double km = sc.nextDouble();
        System.out.println("Introduce los litros");
        double litros = sc.nextDouble();
        System.out.println("Introduce la vMed");
        double vMed = sc.nextDouble();
        System.out.println("Introduce los precio de la gasolina");
        double pGas = sc.nextDouble();

        consumo obj1 = new consumo();
        obj1.setlitros(50);
        obj1.setpGas(1.47);
        obj1.mostrarAtrib1();


        consumo obj2 = new consumo(km, litros, vMed, pGas);
        obj2.mostrarAtrib2();
        obj2.getconsumomedio();
        obj2.setlitros(60);
        obj2.getvMed();

    }

}
