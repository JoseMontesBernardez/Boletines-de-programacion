import javax.swing.*;

public class Boletin_21_4 {
    public static void main(String[] args) {
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del dni para solicitar una letra"));

        char letraDni [] = new char [23];
        letraDni[0] = 't' ;
        letraDni[1] = 'r' ;
        letraDni[2] = 'w' ;
        letraDni[3] = 'a' ;
        letraDni[4] = 'g' ;
        letraDni[5] = 'm' ;
        letraDni[6] = 'y' ;
        letraDni[7] = 'f' ;
        letraDni[8] = 'p' ;
        letraDni[10] = 'x' ;
        letraDni[11] = 'b' ;
        letraDni[12] = 'n' ;
        letraDni[13] = 'j' ;
        letraDni[14] = 'z' ;
        letraDni[15] = 's' ;
        letraDni[16] = 'q' ;
        letraDni[17] = 'v' ;
        letraDni[18] = 'h' ;
        letraDni[19] = 'l' ;
        letraDni[20] = 'c' ;
        letraDni[21] = 'k' ;
        letraDni[22] = 'e' ;


        int resultado = dni%23;



        System.out.println("La letra de su dni será: "+letraDni[resultado]);

    }
}
