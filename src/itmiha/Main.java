import java.util.*;
import java.io.IOException;

public class Main {

    /**
     * Método que descompone un número en sus factores primos y agrega a estos
     * a una lista.
     *
     * @param n Número a descomponer
     * @param l Lista donde se guardan los factores primos
     */
    public static List<Integer> teoremaFundArim(int n, List<Integer> l){
        l.clear();
        int cociente = -1;
        if (n == 1){
            l.add(1);
            return l;
        } else {
            int i = 2;
            while (cociente != 1){
                if (n%i == 0) {
                    cociente = n = n / i;
                    l.add(i);
                } else i++;
            }
            return l;
        }
    }
    /**
     * Método que agrega los números del input a una lista. No considera
     * repeticiones, salvo el primer número.
     *
     * @param a Lista vacía por llenar
     */
    public static List agregarALaLista(List<Integer> a){
        Scanner scn = new Scanner(System.in);
        Integer first = Integer.parseInt(scn.nextLine());
        Integer aux;
        do {
            aux = Integer.parseInt(scn.nextLine());
            if (!a.contains(aux)) a.add(aux);
        } while (scn.hasNextLine());
        a.add(0,first);
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
        if (a.size() == 1) {
            return -1;
        } else {
            Integer numCasos = a.get(0);
            a.remove(0);
            Integer max = Collections.max(a);
            a.add(0,numCasos);
            return max;
        }
    }

    /**
     * Método que consigue todos los primeros n números It-Miha. Sólo guarda en
     * una lista final los números deseados.
     *
     * @param n Último número It-Miha a conseguir.
     * @param a Lista de números It-Miha buscados.
     * @param b Lista donde se guardarán los números It-Miha encontrados.
     */

     // public static List<Integer> findMihas(Integer n, List<Integer> a, List<Integer> b){
     //     int contador = 0;
     //     while (contador < n) {
     //
     //     }
     // }

    public static void main (String args[]){

    }
}
