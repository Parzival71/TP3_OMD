
public class Calculette {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int soustraction(int a, int b) {
        return a - b ;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    
      public static int division(double a, double b){
        if (b == 0){
            throw new IllegalArgumentException("Division par zéro interdite");


        }
        return (int) (a / b);  
    }

    public static void main(String[] args) {
        System.out.println("1 + 3 = " + addition(1,3));
    }
}