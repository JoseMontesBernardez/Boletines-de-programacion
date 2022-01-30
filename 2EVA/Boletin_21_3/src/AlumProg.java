import javax.swing.*;
import java.util.Arrays;

public class AlumProg {


    public static int [] createArrays(int  [] lista){

        for(int i=0; i < lista.length; i++){
            int valorEntero = (int) (Math.random()*10+1);
            lista[i] = valorEntero;

        }
        return lista;
    }

    public static String [] createArraysName(String  [] listaNombres){

        for(int i=0; i < listaNombres.length; i++){
            String nome = JOptionPane.showInputDialog("Introduce un nombre para la posicion: "+i);
            listaNombres[i] = nome;

        }
        return listaNombres;
    }

    public static void showAArrays (int[] lista, String [] listaNombres){
        System.out.println("La lista de nombres con sus notas respectivas notas es: ");
        for(int i=0; i<lista.length; i++){
            System.out.println(i+" "+listaNombres[i]+": "+lista[i]);
        }
    }

    public static void showApproved (int [] lista, String [] listaNombres){

        for(int i=0; i<lista.length; i++){

            if(lista[i]>=5){
                System.out.println(listaNombres[i]+"--> "+lista [i]);
            }
        }



    }

    public static  void consultNote (int [] lista, String [] listaNombres){

        String nombre = JOptionPane.showInputDialog("Introduce el nombre a consultar");
        int encontrado = 0; // no está
        int posicion =0;

        for(int i=0; i<listaNombres.length; i++){

            if (listaNombres[i].equals(nombre)){

                System.out.println("El alumno "+nombre+" tiene de nota un "+lista[i]);
                posicion = i;
                encontrado = 1;
                break;
            }
        }

        if (encontrado == 0){
            System.out.println(nombre+" no está en la lista");
            posicion = -1;
        }

    }

    public static void orderElement(int [] lista, String [] listaNombres){
        System.out.println("La lista de notas en orden ascendente es: ");
        int aux=0;
        String auxNom = null;

        for(int i=0; i<lista.length-1; i++){

            for (int j=i+1; j==lista.length; j++ ){

                if (lista[j]>lista[i]){
                    aux=lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                    auxNom=listaNombres[i];
                    listaNombres[i]=listaNombres[j];
                    listaNombres[j]=auxNom;
                }
            }

        }
        for(int i=0; i<lista.length; i++){
            System.out.println(i+" "+listaNombres[i]+": "+lista[i]);
        }

    }

    public static void copyList(int []lista, String [] listaNombres){
        lista= Arrays.copyOf(lista, 5);
        listaNombres=Arrays.copyOf(listaNombres, 5);

        for(int i=0; i<lista.length; i++)
            System.out.println("posicion "+i+"--> "+lista [i]);
    }



    public void exit(){
        System.exit(0);
    }



}

