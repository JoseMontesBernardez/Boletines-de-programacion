package boletin3_4;

import java.util.Scanner;

public class boletin3_4 {
    public static void main(String[] args) {
        int cantidad;
        int b100=100,b20=20,b5=5,m1=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de euros");
        cantidad=sc.nextInt();

        int resto1=(cantidad%b100);
        int op1=(cantidad-(resto1))/100;
        int resto2=(resto1%b20);
        int op2=(resto1-resto2)/20;
        int resto3=(resto2%b5);
        int op3=(resto2-resto3)/5;
        int resto4=(resto3%m1);
        int op4=(resto3-resto4);

        System.out.println(op1+" billetes de 100");
        System.out.println(op2+" billetes de 20");
        System.out.println(op3+" billetes de 5");
        System.out.println(op4+" monedas de 1");

    }
}
