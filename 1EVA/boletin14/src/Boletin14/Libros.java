package Boletin14;

public class Libros extends Publicacion {

    private String prestado;

    public Libros(){
    }

    public Libros(String codigo, String titulo, String ano_publicacion, String prestado) {
        super(codigo, titulo, ano_publicacion);
        this.prestado = prestado;
    }

    public String getDevolverAno(){
        return super.getAno_publicacion();
    }

    @Override
    public String toString() {
        return ("prestado='" + prestado);
    }
}
