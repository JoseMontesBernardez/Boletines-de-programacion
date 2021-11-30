package boletin15;

public class Disco extends Multimedia{
    private String xenero;

    public String getXenero() {
        return xenero;
    }

    @Override
    public String toString() {
        super.toString();
        return "xenero="+ xenero;
    }
}
