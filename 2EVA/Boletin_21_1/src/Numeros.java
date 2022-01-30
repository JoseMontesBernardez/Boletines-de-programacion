public class Numeros {

    public static int [] createArrays(int  [] lista){

        for(int i=0; i < lista.length; i++){
            int valorEntero = (int) (Math.random()*50+1);
            lista[i] = valorEntero;

        }
        return lista;
    }

    public static void showInvers (int [] lista){

        for(int i=lista.length-1; i>=0; i--)
            System.out.println("posicion "+i+"--> "+lista [i]);


    }

    public static void showArray (int [] lista){

        /*for(int i=6; i<lista.length; i--)
            System.out.println("posicion "+i+"--> "+lista [i]);*/

        for(int i=0; i<lista.length; i++)
            System.out.println("posicion "+i+"--> "+lista [i]);


    }
}
