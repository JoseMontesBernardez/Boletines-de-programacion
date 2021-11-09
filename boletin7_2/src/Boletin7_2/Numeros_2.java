package Boletin7_2;

import javax.swing.*;

public class Numeros_2 {
    public void num_2() {
        short num1 = leerEntero();
        short num2 = leerEntero();

        if (num1 >= num2) {
            JOptionPane.showMessageDialog(null, "La resta es: " + (num1 - num2) + " \n La suma es: " + (num1 + num2));
        } else JOptionPane.showMessageDialog(null, "La suma es: " + (num1 + num2));
    }


    public short leerEntero() {
        String respuesta = JOptionPane.showInputDialog("Teclea numero entero");
        short num = Short.parseShort(respuesta);
        return num;
    }

}
