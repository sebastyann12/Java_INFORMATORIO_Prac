
    
    import java.util.Scanner;

    public class Ejercicio1_9 {
    public static void main(String[]arg){
        Scanner analisText = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String texto = analisText.nextLine();
        System.out.println("¿Qué caracter desea encontrar en el texto previamente ingresado?: ");
        String encontrarText = analisText.nextLine();
        System.out.println("A continuación se mostrará la cantidad de "+ " '" + encontrarText + "'"+ " presentes en la palabra ingresada");
        System.out.println(texto.split(encontrarText, -1).length-1);
    }

}

