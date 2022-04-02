import java.util.*;

/**
 * Pruebas unitarias para el ejercicio It-Miha
 *
 * @author Sergio Medina Guzmán 314332428
 */

public class test extends Main {

    public static void main (String args[]){
        // System.out.println("Ingresa los numeros a la lista, termina con Ctrl+D");
        // List<Long> a = new ArrayList<Long>();
        // List<Long> b = new ArrayList<Long>();
        // agregarALaLista(a);
        // System.out.println("La lista es:");
        // for (int i = 0; i < a.size(); i++){
        //     if (i+1 == a.size()) {
        //         System.out.println(a.get(i) + ".");
        //     } else {
        //         System.out.print(a.get(i) + ", ");
        //     }
        // }
        // System.out.println("El número It-Miha más alto que buscas es el " + getLastItMiha(a) + "° número It-Miha");
        // System.out.println("La lista es:");
        // for (int i = 0; i < a.size(); i++){
        //     if (i+1 == a.size()) {
        //         System.out.println(a.get(i) + ".");
        //     } else {
        //         System.out.print(a.get(i) + ", ");
        //     }
        // }
        // System.out.println("Los números it-miha que pediste son:");
        List<Long> mix = new ArrayList<Long>();
        mix.add(Long.valueOf(1));
        mix.add(Long.valueOf(2));
        mix.add(Long.valueOf(3));
        mix.add(Long.valueOf(4));
        mix.add(Long.valueOf(5));
        mix.add(Long.valueOf(6));
        mix.add(Long.valueOf(7));
        mix.add(Long.valueOf(8));
        mix.add(Long.valueOf(9));
        mix.add(Long.valueOf(10));
        // List<Long> firstN = findFirstnMihas(getLastItMiha(mix));
        // List<Long> finale = giveMeSumItMihas(firstN,mix);
        // for (int i = 0; i < finale.size(); i++){
        //     if (i+1 == finale.size()) {
        //         System.out.println(finale.get(i) + ".");
        //     } else {
        //         System.out.print(finale.get(i) + ", ");
        //     }
        // }
        List<Long> squares = new ArrayList<Long>();
        findSquares(squares);
        System.out.println(isItMiha(10, squares));
        List<Long> firstN = findFirstnMihas(10, squares);
        List<Long> finale = giveMeSumItMihas(firstN,mix);
        for (int i = 0; i < finale.size(); i++){
            if (i+1 == finale.size()) {
                System.out.println(finale.get(i) + ".");
            } else {
                System.out.print(finale.get(i) + ", ");
            }
        }

    }
}
