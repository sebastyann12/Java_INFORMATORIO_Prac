import java.util.Scanner;

public class Ejercicio1_8 {
    public static void main(String[] args) {
        Scanner ingresarNombre=new Scanner(System.in);
        System.out.println("Hola, por favor ingresa tu nombre completo: ");
        String nombre = ingresarNombre.nextLine();
        System.out.println("Hola, por favor ingresa tu edad: ");
        String edad = ingresarNombre.nextLine();
        System.out.println("Hola, por favor ingresa tu direccion: ");
        String direc = ingresarNombre.nextLine();
        System.out.println("Hola, por favor ingresa tu ciudad: ");
        String ciudad = ingresarNombre.nextLine();
        System.out.println(ciudad + "-" + direc + "-" +edad + "-" +nombre );
    }    
}
