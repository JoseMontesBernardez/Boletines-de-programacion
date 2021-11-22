package Boletin8_2;

import javax.swing.*;

public class Area {

    public void calcularArea () {
        String forma;
        forma = pedirForma();
        double area;


        switch (forma) {

            case "cuadrado":  area = areaCuadrado();
            break;

            case  "triangulo": area = areaTriangulo();
            break;

            case  "circulo": area = areaCirculo();
            break;


        }
        JOptionPane.showConfirmDialog(null, "Opcion Incorrecta");


    }

    public String pedirForma (){
        String forma = JOptionPane.showInputDialog("Introduce triangulo, circulo o cuadrado para calcular el area: ");
        return forma;
    }
    public double areaCuadrado(){
        float lado = Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
        double area = lado * lado;
         area = JOptionPane.showConfirmDialog(null, "el area es: "+area);
        return area;
    }
    public double areaCirculo(){

        float radio = Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio del círculo"));
        double area = Math.PI*(radio*radio);
        area = JOptionPane.showConfirmDialog(null, "el area es: "+area);
        return area;
    }
    public double areaTriangulo () {

        float base = Float.parseFloat(JOptionPane.showInputDialog("Introduce la base del triangulo"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
        double area = (base * altura) / 2;
        area = JOptionPane.showConfirmDialog(null, "el area es: "+area);
        return area;
    }

}
