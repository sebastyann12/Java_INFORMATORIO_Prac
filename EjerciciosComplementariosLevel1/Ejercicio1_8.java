import java.util.Scanner;

public class Ejercicio1_8 {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        System.out.println("Hola, por favor ingresa tu nombre completo: ");
        String nombre = datos.nextLine();
        System.out.println("Hola, por favor ingresa tu edad: ");
        int edad = datos.nextInt();
        datos.nextLine();
        System.out.println("Hola, por favor ingresa tu direccion: ");
        String direc = datos.nextLine();
        System.out.println("Hola, por favor ingresa tu ciudad: ");
        String ciudad = datos.nextLine();
        System.out.println(ciudad + "-" + direc + "-" +edad + "-" +nombre );
    }    
}
