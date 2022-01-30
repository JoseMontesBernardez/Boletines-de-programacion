public class Boletin_20_2 {

    public static void main(String[] args) {

        System.out.println("Las aves: ");
        IPodeVoar obx = new Aves();
        IPodeCaminar obx2 = new Aves();
        obx.vuela();
        obx2.camina();

        System.out.println("Dentro de las aves tenemos Avestruces y los papagaios:");
        Papagaio obx3 = new Papagaio();
        Avestruz obx4= new Avestruz();
        obx3.camina();
        obx3.vuela();
        obx4.camina();

        System.out.println("A continuación tenemos los mamiferos");
        IPodeCaminar obx5 = new Mamifero();
        obx5.camina();

        System.out.println("Dentro de los mamiferos tenemos a los felinos y en este grupo por ejemplo tenemos gatos o Tigres");
        Tigre obx7 = new Tigre();
        Gato obx8 = new Gato();
        obx7.camina();
        obx8.camina();



    }
}
