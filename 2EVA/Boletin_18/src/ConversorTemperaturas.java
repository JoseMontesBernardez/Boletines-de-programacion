import javax.swing.*;

public class ConversorTemperaturas {
    static final float TEMP = 80;

    public void centigradosAFharenheit() throws TemperaturaErradaExcepcion {
        float temperatura, resultadoFharenheit;

        temperatura = Integer.parseInt(JOptionPane.showInputDialog("temperatura en grados C"));


        if (temperatura < TEMP)
            throw new TemperaturaErradaExcepcion ("La temperatura no puede ser menor de 80C");
        else{
            resultadoFharenheit=9/5*temperatura+32;
            System.out.println("resultado en FHARENHEIT= "+resultadoFharenheit);
        }

    }

    public void centígradosAReamur() throws TemperaturaErradaExcepcion {

        float temperatura, resultadoReamur;

        temperatura = Integer.parseInt(JOptionPane.showInputDialog("temperatura en grados C"));


        if (temperatura < TEMP)
            throw new TemperaturaErradaExcepcion ("La temperatura no puede ser menor de 80C");
        else{
            resultadoReamur=4/5*temperatura;
            System.out.println("resultado en FHARENHEIT= "+resultadoReamur);
        }

    }
}
