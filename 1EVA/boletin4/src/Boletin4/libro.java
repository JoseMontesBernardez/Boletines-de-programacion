package Boletin4;

public class libro {
    //Atributos
    private String titulo;
    private String autor;
    private int ano;
    private short numpaginas;
    private float valoracion;

    //métodos
    public libro() {

    }

    public libro(String titulo, String autor, int ano, short numpaginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
        this.numpaginas = numpaginas;
    }

    // metodos de acceso

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setNumPaginas(Short numpaginas) {
        this.numpaginas = numpaginas;
    }

    public Short getNumPaginas() {
        return numpaginas;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void mostrarLibro() {
        System.out.println("Las características del Boletin4.libro  son: \n autor: " + autor + " \n titulo:" + titulo + "\n año: " + ano + "\n numero de paginas: " + numpaginas + "\n valoracion: " + valoracion);


    }

}
