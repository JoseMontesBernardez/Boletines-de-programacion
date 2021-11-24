package Boletin14;

public class Publicacion {
    private String codigo;
    private String titulo;
    private String ano_publicacion;

    public Publicacion() {
    }

    public Publicacion(String codigo, String titulo, String ano_publicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano_publicacion = ano_publicacion;
    }

    public String getAno_publicacion() {
        return ano_publicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return ("codigo='" + codigo +", titulo='" + titulo +", ano_publicacion='" + ano_publicacion);
    }
}
