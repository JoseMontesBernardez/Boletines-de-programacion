package Boletin6_1;

public class coche {
    private int velocidad;

    public coche() {
        velocidad = 0;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar(int valor) {

        velocidad = velocidad + valor;
        System.out.println("La velocidad aumentó a: " + velocidad);

    }

    public void frenar(int menos) {

        velocidad = velocidad - menos;
        System.out.println("El Boletin6_1.coche frenó a: " + velocidad);

    }

}
