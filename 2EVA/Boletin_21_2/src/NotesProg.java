import java.util.Arrays;

public class NotesProg {

    public static int [] createArrays(int  [] lista){

        for(int i=0; i < lista.length; i++){
            int valorEntero = (int) (Math.random()*10+1);
            lista[i] = valorEntero;

        }
        return lista;
    }

    public static void showApproved (int [] lista){

        for(int i=0; i<lista.length; i++){

            if(lista[i]>=5){
                System.out.println(i+"--> "+lista [i]);
            }
        }


    }

    public static void showFails (int [] lista){

        for(int i=0; i<lista.length; i++){

            if(lista[i]<5){
                System.out.println(+i+"--> "+lista [i]);
            }
        }


    }

    public static int[] showHighNote (int [] lista){
        Arrays.sort(lista);
        System.out.println("La nota más alta es: "+lista[29]);
        return lista;

    }

    public static void avg (int [] lista){
        float avg =0;


        for(int i=0; i<lista.length; i++){
            avg=avg+lista[i];
        }
        System.out.println("La nota media es: "+(avg/30));
    }
}
