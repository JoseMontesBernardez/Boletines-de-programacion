package Boletin8_1;

import javax.swing.*;

public class Ventas {
    public void rangoVentas () {
        String name;
        int price;
        name = pedirName();
        price = pedirPrice();

        if (price<=100){
            JOptionPane.showInputDialog(null, name+" es un articulo de bajo consumo");
        }
        else if (price<=500){
            JOptionPane.showInputDialog(null, name+" es un articulo de consumo medio");
        }
        else if (price<=1000){
            JOptionPane.showInputDialog(null, name+" es un articulo de consumo alto");
        }
        else{
            JOptionPane.showInputDialog(null, name+" es un articulo de primera necesidad");
        }
    }

    public  String pedirName () {
        String name = JOptionPane.showInputDialog("Dame el nombre del producto");
        return name;
    }
    public int pedirPrice () {
        int price = Integer.parseInt(JOptionPane.showInputDialog("Dame el precio del producto"));
        return price;
    }

}
