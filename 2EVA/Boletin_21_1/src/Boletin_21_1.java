public class Boletin_21_1 {

    public static void main(String[] args) {

        int []aleatorios = new int [6];
        Numeros obx = new Numeros();

        aleatorios = Numeros.createArrays(aleatorios);
        System.out.println("Lista ordenada: ");
        Numeros.showArray(aleatorios);
        System.out.println("Lista invertida: ");
        Numeros.showInvers(aleatorios);




    }
}
