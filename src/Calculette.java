
public class Calculette {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int soustraction(int a, int b) {
        return a - b ;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }
    
    public static int division(double a, double b){
        if (b == 0){
            // Test conflit
            throw new IllegalArgumentException("Division par zéro interdite");

        }
        return (int) (a / b);  
    }
    // Modifiez le nom et le corps de la fonction
    public double diviser(double a, double b) {
      if (b == 0) {
        System.out.println("Erreur critique : denominateur nul !");
        return 0;
    }
    return a / b;
}


    public static void main(String[] args) {
        System.out.println("1 + 3 = " + addition(1,3));
    }
}