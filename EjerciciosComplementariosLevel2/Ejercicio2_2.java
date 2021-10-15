import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner numScanner = new Scanner(System.in);
        System.out.println("ingresa el primer numero");
        num1= numScanner.nextInt();
        System.out.println("ingresa el ultimo numero");
        num2= numScanner.nextInt();
        List<Integer>  numEntero = new ArrayList<>();
        numEntero.add(num1);
        numEntero.add(1);
        numEntero.add(2);
        numEntero.add(3);
        numEntero.add(4);
        numEntero.add(5);
        numEntero.add(num2);
        for (int i = 1; i < 6; i++) {
            System.out.println("Numeros en la lista: "+numEntero.get(i));
        }

        System.out.println("Cantidad de numeros en la lista despues de agregar dos: "+numEntero.size());
        for (int i = 0; i < numEntero.size(); i++) {
            System.out.println("Numeros en la lista: "+numEntero.get(i));
        }
        
        numEntero.remove(0);
        numEntero.remove(5);

        System.out.println("Cantidad de numeros en la lista antes de agregar dos: " + numEntero.size());
        
        
    }
}

