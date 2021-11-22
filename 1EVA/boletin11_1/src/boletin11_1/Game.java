package boletin11_1;

import javax.swing.*;

public class Game {
    public void adivinarNumero () {
        int n_1 = darNumero();
        int r_1 = rango_1();
        int r_2 = rango_2();
        int i = numeroIntentos();
        int j;

        JOptionPane.showMessageDialog(null, "El numero estará entre " + r_1 + " y " + r_2+" y tienes "+i+" intentos");
        int n_2;

       for (j=1; j<=i; j++){
           n_2 = pedirNumero();
           if (n_2 == n_1){
               JOptionPane.showMessageDialog(null, "HAS GANADO");

           }else if (n_2 < n_1){
               JOptionPane.showMessageDialog(null, "El numero es mayor");
           }else if (n_2>n_1) {
               JOptionPane.showMessageDialog(null, "El numero es menor");
           }

            }
        JOptionPane.showMessageDialog(null, "HAS PERDIDO");
        }

    public int darNumero(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a adivinar por el otro jugador: "));
        return num;
    }
    public int pedirNumero(){
        int num_2 = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero: "));
        return num_2;
    }
    public int rango_1(){
        int rango_1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero mas bajo del rango"));
        return rango_1;

    }
    public int rango_2 (){
        int rango_2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero mas alto del rango"));
        return rango_2;
    }
    public int numeroIntentos(){
        int intentos = Integer.parseInt(JOptionPane.showInputDialog("Numero de intentos del jugador"));
        return  intentos;
    }
}
