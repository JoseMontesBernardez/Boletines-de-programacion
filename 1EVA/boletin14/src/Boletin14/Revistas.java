package Boletin14;

public class Revistas extends Publicacion{
    private int num;

    public Revistas(){

    }

    public Revistas(String codigo, String titulo, String ano_publicacion, int num) {
        super(codigo, titulo, ano_publicacion);
        this.num = num;
    }

    @Override
    public String toString() {
        return ("num=" + num);
    }
}
