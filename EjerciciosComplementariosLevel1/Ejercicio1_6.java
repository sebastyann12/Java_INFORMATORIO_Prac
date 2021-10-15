import java.util.Scanner;
public class Ejercicio1_6 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner numInt = new Scanner(System.in);
        System.out.println("Inngresa un número entero: ");
        num1 = numInt.nextInt();

        System.out.println("Ingresa la potencia ");
        num2 = numInt.nextInt();
        int pot=1;
        for (int i=1; i<=num2; i++ ) {
        pot= pot*num1 ;       
        }
        System.out.println(num1 + " elevado a " + num2 + " = " +pot);
    }
}
