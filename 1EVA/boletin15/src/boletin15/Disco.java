package boletin15;

public class Disco extends Multimedia{
    private String xenero;

    public String getXenero() {
        return xenero;
    }

    @Override
    public String toString() {

        return (super.toString()+"xenero="+ xenero);
    }
}
