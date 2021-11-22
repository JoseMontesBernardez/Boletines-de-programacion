package boletin9_4;

import javax.swing.*;

public class Multiplicacion {
    public void mostrarMultiplicacion(){


        int i=0;
        int j=pedirNumero();



        while (j != 0){
            for (i=0; i<11; i++)
                System.out.println(i+"= "+(i*j));
            j = pedirNumero();
        }


    }



    public int pedirNumero(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        return num;
    }
}
