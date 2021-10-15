import java.util.Scanner;
public class Ejercicio1_3 {
    
    
    public static void main(String[] args) {
        int num1;
        Scanner entero = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        num1 = entero.nextInt();
        
        for (int i = 0; i < num1; i++) {
            for (int j = 1; j < i+2; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }    
    }
}
