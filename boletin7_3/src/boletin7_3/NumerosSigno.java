package boletin7_3;

import javax.swing.*;

public class NumerosSigno {
    public void numSigno() {
        int num = leerNumero();

        if (num > 0) {
            JOptionPane.showMessageDialog(null, " + ");
        } else if (num < 0) {
            JOptionPane.showMessageDialog(null, " - ");
        } else
            JOptionPane.showMessageDialog(null, " 0 ");

    }

    public int leerNumero() {
        String respuesta = JOptionPane.showInputDialog("Teclea un número ");
        int num = Integer.parseInt(respuesta);
        return num;
    }

}
