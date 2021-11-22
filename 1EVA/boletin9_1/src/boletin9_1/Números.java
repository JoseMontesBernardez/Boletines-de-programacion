package boletin9_1;

import javax.swing.*;

public class Números {
    public void mostrarNumeros (){
        for (int i=0; i<10; i++){

            int num = leerNumero ();

            if(num>0){
                System.out.println(" Es positivo ");
            }
            else if (num<0){
                System.out.println(" Es negativo ");
            }
            else{
                System.out.println(" Es cero ");
            }
        }
    }







    public int leerNumero (){
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Teclea un número: "));
        return numero;
    }
}
