package Boletin6_2;

public class satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    public satelite() {

        meridiano = paralelo = distanciaTerra = 0;
    }

    public satelite(double m, double p, double d) {

        this.meridiano = m;
        this.paralelo = p;
        this.distanciaTerra = d;

    }

    public void setMeridiano(double m) {
        this.meridiano = m;
    }

    public void setParalelo(double p) {
        this.paralelo = p;
    }

    public void setDisterra(double m) {
        this.distanciaTerra = m;
    }

    public void verPosicion() {

        System.out.println("o Boletin6_2.satelite atopase no paralelo: " + paralelo + " ,meridiano " + meridiano + " e a unha distancia da terra de " + distanciaTerra);
    }

}
