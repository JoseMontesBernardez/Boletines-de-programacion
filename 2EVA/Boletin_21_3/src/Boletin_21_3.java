import javax.swing.*;
import java.util.Arrays;

public class Boletin_21_3 {

    public static void main(String[] args) {

        String [] nameAlum = new String [5];
        nameAlum = AlumProg.createArraysName(nameAlum);

        int []notasAlum = new int [5];
        AlumProg obx = new AlumProg();
        notasAlum = AlumProg.createArrays(notasAlum);

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1--> Consultar nota alumno \n 2--> Alumnos aprovados " +
                    "\n 3--> Mostrar listas \n 4-->Ordenar listas \n 5--> Salida"));
            switch(opcion){

                case 1 : AlumProg.consultNote(notasAlum, nameAlum);
                    break;

                case 2 : AlumProg.orderElement(notasAlum, nameAlum);

                case 3 : AlumProg.showAArrays(notasAlum, nameAlum);
                    break;

                case 4 : AlumProg.orderElement(notasAlum, nameAlum);
                    break;

                case 5 : obx.exit();
                    break;
            }


        } while (opcion<7);



    }

}
