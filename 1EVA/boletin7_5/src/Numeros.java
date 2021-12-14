public class Numeros {
    private float num1;
    private float num2;
    private float num3;

    public void Numeros(float num1, float num2, float num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    public void compararNumeros(){
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+"es el mayor");
            }
            else if(num3>num2){
                System.out.println(num3+"es el mayor");

            }
        }
        else if (num2>num3){
            System.out.println(num2+"es el mayor");
        }
    }

}
