package boletin15;

public class Disco extends Multimedia{
    private String xenero;

    public Disco(String titulo, String autor, String formato, float duracion, String xenero) {
        super(titulo, autor, formato, duracion);
        this.xenero = xenero;
    }

    @Override
    public String toString() {
        return "xenero="+ xenero;
    }
}
