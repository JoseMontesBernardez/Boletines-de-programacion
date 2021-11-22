package Boletin7_4;

import javax.swing.*;

public class Personas {
    private String nom1;
    private String nom2;
    private float weight1;
    private float weight2;

    public  void Personas (String nom1, String nom2, float weight1, float weight2) {
        this.nom1=nom1;
        this.nom2=nom2;
        this.weight1=weight1;
        this.weight2=weight2;
    }


    public void compararPeso () {

        if (weight1>weight2){
            JOptionPane.showMessageDialog(null, nom1+" pesa más y la diferencia de peso es: "+(weight1-weight2));
        }
        else if (weight2>weight1){
            JOptionPane.showMessageDialog(null, nom2+" pesa más y la diferencia de peso es: "+(weight2-weight1));
        }
        else
            JOptionPane.showMessageDialog(null, nom1+" y "+nom2+" pesan lo mismo");



    }

}
