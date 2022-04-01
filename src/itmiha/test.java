import java.util.*;

/**
 * Pruebas unitarias para el ejercicio It-Miha
 *
 * @author Sergio Medina Guzmán 314332428
 */

public class test extends Main {

    public static void main (String args[]){
        System.out.println("Ingresa los numeros a la lista, termina con Ctrl+D");
        List<Integer> a = new ArrayList<Integer>();
        agregarALaLista(a);
        System.out.println("La lista es:");
        for (int i = 0; i < a.size(); i++){
            if (i+1 == a.size()) {
                System.out.println(a.get(i) + ".");
            } else {
                System.out.print(a.get(i) + ", ");
            }
        }
        System.out.println("El número It-Miha más alto que buscas es el " + getLastItMiha(a) + "° número It-Miha");
    }
}
