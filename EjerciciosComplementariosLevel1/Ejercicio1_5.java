 import java.util.Scanner;  
 public class Ejercicio1_5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner numInt = new Scanner(System.in);
        System.out.println("Inngresa el primer número entero: ");
        num1 = numInt.nextInt();

        System.out.println("Ingresa otro número entero: ");
        num2 = numInt.nextInt();
        int suma =0;
        for (int i=1; i<=num2; i++ ) {
        suma= suma+num1 ;       
        }
        System.out.println(num1 + "x" + num2 + "=" +suma);
    }
 }
 