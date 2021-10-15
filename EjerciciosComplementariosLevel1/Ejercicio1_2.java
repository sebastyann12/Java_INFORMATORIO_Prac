import java.util.Scanner;
public class Ejercicio1_2 {
  
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner numInt = new Scanner(System.in);
        System.out.println("Inngresa el primer número entero: ");
        num1 = numInt.nextInt();

        System.out.println("Ingresa otro número entero: ");
        num2 = numInt.nextInt();
        
        int sum = num1 + num2;
        int res = num1 - num2;
        int mult = num1 * num2;
        int divi = num1 / num2;
        int porc = num1 % num2;
        System.out.println(num1 + " + " + num2 + " " +"="+ " " +sum);
        System.out.println(num1 + " - " + num2 + " " +"="+ " " +res);
        System.out.println(num1 + " * " + num2 + " " +"="+ " " +mult);
        System.out.println(num1 + " / " + num2 + " " +"="+ " " +divi);
        System.out.println(num1 + " % " + num2 + " " +"="+ " " +porc);
        
    }
}
