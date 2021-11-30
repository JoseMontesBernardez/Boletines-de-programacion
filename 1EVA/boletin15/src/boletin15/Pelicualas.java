package boletin15;

public class Pelicualas extends Multimedia{
    private String actor_Principal;
    private String actriz_Principal;


    public String getActor_Principal() {
        return actor_Principal;
    }

    public String getActriz_Principal() {
        return actriz_Principal;
    }

    @Override
    public String toString() {
        super.toString();
        return "actor_Principal=" + actor_Principal +", actriz_Principal='" + actriz_Principal;
    }
}
