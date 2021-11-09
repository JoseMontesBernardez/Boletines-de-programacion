package Boletin4;

public class Boletin4 {
    public static void main(String[] args) {
        libro libro1 = new libro();
        libro1.mostrarLibro();

        libro libro2 = new libro("aaa", "ccc", 2021, (short) 32);
        libro2.mostrarLibro();
    }

}
