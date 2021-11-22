package boletin11_2;

import javax.swing.*;

public class Juego_2 {
    public void adivinarNumero () {
        int r_1 = 1;
        int r_2 = 50;
        int i = numeroIntentos();
        int j;
        int n_1 = (int) (Math.random()*r_2+1);
        int n_2;

        JOptionPane.showMessageDialog(null, "El numero estará entre " + r_1 + " y " + r_2+" y tienes "+i+" intentos");

        for (j=1; j<=i; j++) {
            n_2 = pedirNumero();
            if (n_2 == n_1) {
                JOptionPane.showMessageDialog(null, "HAS GANADO");
                break;
            } else if (n_2 != n_1) {
                if (Math.abs(n_2 - n_1) > 20) {
                    JOptionPane.showMessageDialog(null, "Estás muy lejos");
                } else if (Math.abs(n_2 - n_1) >= 10) {
                    JOptionPane.showMessageDialog(null, "Estás lejos");
                } else if (Math.abs(n_2 - n_1) >= 5) {
                    JOptionPane.showMessageDialog(null, "Estás cerca");
                } else if (Math.abs(n_2 - n_1) < 5) {
                    JOptionPane.showMessageDialog(null, "Estás muy cerca");
                }
            }
            if (j == i) {
                JOptionPane.showMessageDialog(null, " HAS PERDIDO");
            }
            }
        JOptionPane.showMessageDialog(null, "SALIDA DEL JUEGO");
    }

    public int pedirNumero(){
        int num_2 = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero: "));
        return num_2;
    }

    public int numeroIntentos(){
        int intentos = Integer.parseInt(JOptionPane.showInputDialog("Numero de intentos del jugador"));
        return  intentos;
    }
}
