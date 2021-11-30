package boletin15;

public class Multimedia {
    private String titulo;
    private String autor;
    private String formato;
    private String duracion;


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public String getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo +", autor='" + autor +", formato='" + formato + ", duracion=" + duracion;
    }
}
