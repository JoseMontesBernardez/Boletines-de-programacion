public class Morcego extends Mamifero implements IPodeVoar {
    @Override
    public void vuela() {
        System.out.println("Puede volar");
    }

    public void camina(){
        super.camina();
    }
}
