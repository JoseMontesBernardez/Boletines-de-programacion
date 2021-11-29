package boletin15;

public class Pelicualas extends Multimedia{
    private String actor_Principal;
    private String actriz_Principal;

    public Pelicualas(String titulo, String autor, String formato, float duracion, String actor_Principal, String actriz_Principal) {
        super(titulo, autor, formato, duracion);
        this.actor_Principal = actor_Principal;
        this.actriz_Principal = actriz_Principal;
    }

    @Override
    public String toString() {
        super.toString();
        return "actor_Principal='" + actor_Principal +", actriz_Principal='" + actriz_Principal;
    }
}
