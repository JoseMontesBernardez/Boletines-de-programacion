package Boletin7_1;

import javax.swing.*;

public class NumeroPositivo {
    public void numPositivo() {
        int num = leerEntero();

        if (num >= 0)
            JOptionPane.showMessageDialog(null, num + " es positivo");

    }

    public int leerEntero() {
        String respuesta = JOptionPane.showInputDialog("Teclea numero entero");
        int num = Integer.parseInt(respuesta);
        return num;

    }

}
