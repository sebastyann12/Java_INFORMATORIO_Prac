
//Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga 
// de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego 
//imprimir el total final a cobrar.
//[6, 7, 8, 4, 5]  [350, 345, 550, 600, 320]
//[2100, 2415, 4400, 2400, 1600] Total Final: $ 12915

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio2_5 {
    public static void main(String[] args) {
    int hora = 0;
    int valor =0;
    Integer [] horaTrab={0,0,0,0,0};
    Integer [] valorHora={0,0,0,0,0};
    Integer [] totales={0,0,0,0,0};
    int total =0;
    Scanner horScanner = new Scanner(System.in);
    System.out.println("Ingrese las horas trabajadas de lunes a viernes");
    for (int i=0; i< 5; i++) {
        hora = horScanner.nextInt();
        horaTrab[i]= hora; 
    } 
    System.out.println("Ingrese el valor por hora");
    for (int i=0; i< 5; i++) {
        valor = horScanner.nextInt();
        valorHora[i]= valor; 
    } 
    
    System.out.println("Totales por dia:");
    for (int i=0; i< 5; i++) {
        totales[i]= valorHora[i] *horaTrab[i]; 
    } 

    for (int i=0; i< 5; i++) {
        total= total + totales[i]; 
    }
   

    System.out.println(Arrays.toString(totales));
    System.out.println("Total a cobrar: $"+ total);
   
    
    }
}
