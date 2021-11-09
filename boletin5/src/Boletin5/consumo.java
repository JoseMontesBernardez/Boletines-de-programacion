package Boletin5;

public class consumo {
    //Atributos
    private double km;
    private double litros;
    private double vMed;
    private double pGas;


    //Metodos contructores

    public consumo() {
    }

    public consumo(double km, double litros, double vMed, double pGas) {

        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;

    }

//otros métodos

    public void getTempo(double horas) {
        System.out.println("El viaje duro" + horas + " horas");

    }

    public void getconsumomedio() {
        double consMedio = (litros * 100) / km;
        System.out.println("El Boletin5.Boletin5.consumo medio es de " + consMedio);
    }

    public double consEuros() {
        double consEuros;
        consEuros = pGas * ((litros * 100) / km);
        return 0;
    }

    public void setKm(double km) {
        this.km = km;

    }

    public void setlitros(double litros) {
        this.litros = litros;
    }

    public void setvMed(double vMed) {
        this.vMed = vMed;
    }

    public double getvMed() {
        System.out.println("La velocidad media es: " + vMed);
        return vMed;
    }

    public void setpGas(double pGas) {
        this.pGas = pGas;
    }

    public void mostrarAtrib1() {
        System.out.println("Los datos son: \n litros " + litros + "\n pGas: " + pGas);
    }

    public void mostrarAtrib2() {
        System.out.println("Los datos son: \n Km: " + km + "\n litros " + litros + "\n vMed: " + vMed + "\n pGas: " + pGas);
    }

}
