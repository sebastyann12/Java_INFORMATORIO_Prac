import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        ArrayList cartas = new ArrayList<>();
        cartas.add("2");
        cartas.add("3");
        cartas.add("4");
        cartas.add("5");
        cartas.add("6");
        cartas.add("7");
        cartas.add("8");
        cartas.add("9");
        cartas.add("10");
        cartas.add("J");
        cartas.add("Q");
        cartas.add("K");
        cartas.add("A");
        System.out.println("CARTAS ORDENADAS");
        for (int k = 0; k <cartas.size() ; k++) {
            System.out.println(cartas.get(k));
        }
        
        System.out.println("CARTAS EN REVERSO");
        Collections.reverse(cartas);
        for (int i = 0; i <cartas.size() ; i++) {
            System.out.println(cartas.get(i));
        }
       
        System.out.println("CARTAS MEZCLADAS");
        Collections.shuffle(cartas);

        for (int j = 0; j <cartas.size() ; j++) {
            System.out.println(cartas.get(j));
        }
        
    }
}
