import javax.swing.*;
import java.util.Scanner;

public class boletin2_3 {
    public static void main(String[] args) {
        float euros;
        float dolar;
        float cambio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de euros a cambiar");
        euros=sc.nextFloat();
        System.out.println("Introduce el valor actual del dolar");
        dolar=sc.nextFloat();
        cambio=(euros*dolar);
        System.out.println("El cambio de auros a dolares en este momento sería de: "+cambio+" dolares");


    }
}
