package boletin9_5;

import javax.swing.*;

public class Sueldos {

    public void opSueldos (){
        int j_1=0;
        int j_2=0;
        int i_1=1;
        int i_2=0;
        float sueldo = pedirSueldo();

        while (sueldo != 0) {
            if (sueldo>=1000&&sueldo<=1750){

                j_1=j_1+i_1;

            }else if (sueldo<1000){
                i_2++;
                j_2=j_2+i_2;

            }
            sueldo = pedirSueldo();

        }
        System.out.println("Cobran entre 1000 y 1750 "+j_1+" trabajadores");
        System.out.println("El porcentaje de trabajadores que cobra menos de 1000 son: "+((100*j_2)/(j_1+j_2))+"%");
        System.out.println("Salida del programa");
    }
    public float pedirSueldo() {
        float sueldo = Float.parseFloat(JOptionPane.showInputDialog("Introduce un sueldo: "));
        return sueldo;
    }
}
