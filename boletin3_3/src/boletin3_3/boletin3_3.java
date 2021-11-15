package boletin3_3;

import java.util.Scanner;

public class boletin3_3 {
    public static void main(String[] args) {

        final int V_100=100,V_20=20,V_5=5,V_1=1;
        int c_100,c_20,c_5,c_1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de billetes de 100");
        c_100=sc.nextInt();
        System.out.println("Introduce la cantidad de billetes de 20");
        c_20=sc.nextInt();
        System.out.println("Introduce la cantidad de billetes de 5");
        c_5=sc.nextInt();
        System.out.println("Introduce la cantidad de monedas de 1");
        c_1=sc.nextInt();

        System.out.println("has introducido "+((c_100*V_100)+(c_20*V_20)+(c_5*V_5)+(c_1*V_1))+" euros");


    }
}
