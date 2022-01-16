public class Boletin_18 {

    public static void main(String[] args) {

        ConversorTemperaturas obx = new ConversorTemperaturas();


        try {
            obx.centigradosAFharenheit();
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println(" Error Temp "+ex.toString());
        }

        try {
            obx.centígradosAReamur();
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println(" Error Temp "+ex.toString());
        }




    }
    }


