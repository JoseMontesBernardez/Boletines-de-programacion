package boletin15;

public class Multimedia {
    private String titulo;
    private String autor;
    private String formato;
    private float duracion;


    public Multimedia (String titulo, String autor, String formato, float duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo +", autor='" + autor +", formato='" + formato + ", duracion=" + duracion;
    }
}
