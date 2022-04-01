import java.util.*;
import java.io.IOException;

public class Main {

    /**
     * Método que agrega los números del input a una lista
     *
     * @param a Lista vacía por llenar
     */
    public static List agregarALaLista(List<Integer> a){
        Scanner scn = new Scanner(System.in);
        do {
            a.add(Integer.parseInt(scn.nextLine()));
        } while (scn.hasNextLine());
        return a;
    }

    /**
     * Método que revisa cuál es el número It-Miha más alto que buscamos. No
     * considera el primer número, pues es el número de casos que buscaremos.
     * lo guardamos en una variable primero para dejar al final la lista sin
     * cambios.
     *
     * @param a Lista a revisar
     */
    public static Integer getLastItMiha(List <Integer> a){
        Integer numCasos = a.get(0);
        a.remove(0);
        Integer max = Collections.max(a);
        a.add(0,numCasos);
        return max;
    }

    public static void main (String args[]){

    }
}