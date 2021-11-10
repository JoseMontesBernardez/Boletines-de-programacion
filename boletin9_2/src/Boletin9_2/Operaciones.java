package Boletin9_2;

public class Operaciones {
    public void opSuma(){

        int i=10;
        int j=0;



        while (i<90){
            j=j+i;
            i=i+1;

        }
        System.out.println(" El resultado de la suma es: "+j);

    }

    public void opProducto(){

        int i=10;
        double j=1;



        while(i<90){
            j=j*i;
            i=i+1;

        }
        System.out.println(" El resultado del producto es: "+j);

    }
}
