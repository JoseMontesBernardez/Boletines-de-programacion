package boletin3_5;

import java.util.Scanner;

public class boletin3_5 {
    public static void main(String[] args) {
        double sueldo_bruto; //Declaro la variable del salario bruto
        double sueldo_fijo, importe_ventas, Km, dias_desplazamiento; //Declaro las variables del sueldo fijo, importe ventas, Km y dias desplazados
        final double IRPF=0.18, COMISION=0.05, QUILOMETRAJE=2, DESPLAZAMIENTO=30, RSG=36;// Declaro las constantes que van a intervenir en el programa

        Scanner sc = new Scanner(System.in); //Declaro el Scanner para poder introducir valores por teclado

        System.out.println("Introduce el sueldo fijo: ");//Pido por pantalla el sueldo fijo
        sueldo_fijo=sc.nextDouble();
        System.out.println("Introduce el importe de ventas: ");//Pido por pantalla el importe de ventas
        importe_ventas=sc.nextDouble();
        System.out.println("Introduce el Kilometraje: ");//Pido por pantalla el kilometraje
        Km=sc.nextDouble();
        System.out.println("Introduce los dás de desplazamiento: ");//Pido por pantalla los dias desplazados
        dias_desplazamiento=sc.nextDouble();

        System.out.println("El sueldo bruto es de "+(sueldo_fijo+(importe_ventas*COMISION)+(dias_desplazamiento*DESPLAZAMIENTO))+" euros");
        //Muestro en pantalla el sueldo bruto con las operaciones ya hechas
        System.out.println("El sueldo líquido es de "+(((sueldo_fijo+(importe_ventas*COMISION)+(dias_desplazamiento*DESPLAZAMIENTO))-36)*(1-IRPF))+" euros");
        //Muestro en pantalla el sueldo líquido




    }
}
