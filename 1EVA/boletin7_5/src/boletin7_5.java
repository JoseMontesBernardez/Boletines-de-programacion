import java.util.Scanner;

public class boletin7_5 {

    public static void main(String[] args) {

        System.out.println("Introduce los siguientes datos");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        float num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        float num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        float num3 = sc.nextInt();

        Numeros obx = new Numeros();
        obx.Numeros(num1, num2, num3);
        obx.compararNumeros();



    }
}
