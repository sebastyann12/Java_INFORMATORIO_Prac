import java.util.List;
import java.util.ArrayList;
//Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos 
//(3 arrayList) e imprimir dichos cursos.
public  class Ejercicio2_4 {
    public static void main(String[] args) {
        
        List<String> estudiantes = new ArrayList<>();
        estudiantes.add("Nicolas Martinez");
        estudiantes.add("roberto Martinez");
        estudiantes.add("Sandra Martinez");
        estudiantes.add("Rocio Martinez");
        estudiantes.add("Ana Martinez");
        estudiantes.add("Juan Martinez");
        estudiantes.add("Carlos Martinez");
        estudiantes.add("Lizandro Martinez");
        estudiantes.add("Mirian Martinez");
        estudiantes.add("Gabriel Martinez");
        estudiantes.add("Mateo Martinez");
        estudiantes.add("Agustin Martinez");

        List<String> claseA = estudiantes.subList(0, 4);
        List<String> claseB = estudiantes.subList(4, 8);
        List<String> claseC = estudiantes.subList(8, 12);

        System.out.println("Clase A");
        for (int i = 0; i < claseA.size(); i++) {
            System.out.println(claseA.get(i));
        }
            
            
        
        System.out.println("Clase B");
        for (int i = 0; i < claseB.size(); i++) {
            System.out.println(claseB.get(i));
        }

       //esta es una forma de imprimir la lista entera de una sola vez sin interar
       System.out.println("Clase C");    
       System.out.println(claseC);
            
        


    }
    
}
    
    
