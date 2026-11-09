
public class Calculette {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int soustraction(int a, int b) {
        return a - b ;
    }

    // Modifiez le nom et le corps de la fonction
    public double diviser(double numerateur, double denominateur) {
      if (denominateur == 0) {
        System.out.println("Erreur critique : denominateur nul !");
        return 0;
    }
    return numerateur / denominateur;
}


    public static void main(String[] args) {
        System.out.println("1 + 3 = " + addition(1,3));
    }
}