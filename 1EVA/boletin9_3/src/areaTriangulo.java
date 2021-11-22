import javax.swing.*;

public class areaTriangulo {
    public void calcularArea(){
        float base = pedirBase();
        float altura = pedirAltura();

        if (base<0){
            JOptionPane.showInputDialog(null, "El dato es incorrecto");
        }else if (altura<0){
            JOptionPane.showInputDialog(null, "El dato es incorrecto");
        }else {
            double area = (base*altura)/2;
            JOptionPane.showInputDialog("El area del triangulo es de: "+area);
        }
    }


    public float pedirAltura (){
        float altura = Float.parseFloat(JOptionPane.showInputDialog(" Teclea la altura: "));
        return altura;
    }
    public float pedirBase(){

        float base = Float.parseFloat(JOptionPane.showInputDialog(" Teclea la base: "));
        return base;
    }
}
