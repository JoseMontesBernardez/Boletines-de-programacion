public class Boletin_19 {

    public static void main(String[] args) {

        // Creamos tres objetos referenciando la interface
        IPodeCantar obx1 = new Persoa();
        IPodeCantar obx2 = new Canario();
        IPodeCantar obx3 = new Galo();

        // Ahora procedemos a llamar al método cantar con los diferentes objetos creados
        obx1.cantar();
        obx2.cantar();
        obx3.cantar();

    }

}
