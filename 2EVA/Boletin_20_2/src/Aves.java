public class Aves implements IPodeVoar, IPodeCaminar{
    @Override
    public void camina() {
        System.out.println("Pode caminar");
    }

    @Override
    public void vuela() {
        System.out.println("Pode voar");

    }
}
