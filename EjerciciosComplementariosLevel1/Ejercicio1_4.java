import java.util.Scanner;

public class Ejercicio1_4 {
    
    public static void main(String[] args) {
    Scanner numero= new Scanner(System.in);
    System.out.println("Ingrese el numero del cual desea obtener su factorial");
    int factorial= numero.nextInt();
    int num = 1;
    
    for (int i=1 ; i <= factorial ; i++) {
        num= num*i;
    }


    System.out.println("El factorial de"+ factorial + "es: "+ num );
       
       
    }
        
    }
        
    
        
        

