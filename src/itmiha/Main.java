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
     * Método que descompone un número en sus factores primos y agrega a estos
     * a una lista.
     *
     * @param n Número a descomponer
     *
     */
    public static List<Integer> teoremaFundArim2(int n){
        List<Integer> l = new ArrayList<Integer>();
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
        while (scn.hasNextLine()) {
            aux = Integer.parseInt(scn.nextLine());
            if (!a.contains(aux)) a.add(aux);
        }
        a.add(0,first);
        return a;
    }

    /**
     * Método que ve si en una lista de enteros hay al menos una repetición.
     *
     * @param l Lista a revisar
     */
     public static boolean hayRepes(List<Integer> l){
         Integer aux;
         boolean repeated = false;
         for (int i = 0; i < l.size(); i++){
             aux = l.get(i);
             l.remove(i);
             repeated = l.contains(aux);
             l.add(i,aux);
             if (repeated == true) break;
         }
         return repeated;
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
     * Método que consigue todos los primeros n números It-Miha.
     *
     * @param n Último número It-Miha a conseguir.
     *
     */

     public static List<Integer> findFirstnMihas(Integer n){
         int contador = 0;
         int i = 1;
         List<Integer> mihas = new ArrayList<Integer>();
         mihas.add(-1);
         while (contador < n) {
             if (hayRepes(teoremaFundArim2(i))){
                 i++;
             } else {
                 contador++;
                 mihas.add(i);
                 i++;
             }
         }
         return mihas;
     }

    /**
     * Método que dada una lista de números It-Miha, devuelve una lista con
     * los números deseados (por ejemplo: el primero, el doceavo, etc.)
     *
     * @param l Lista de números It-Miha
     * @param m Lista de números It-Miha deseados.
     *
     */

    public static List<Integer> giveMeSumItMihas(List<Integer> l, List<Integer> m) {
        m.remove(0);
        List<Integer> askedItMihas = new ArrayList<Integer>();
        for (Integer i: m){
            askedItMihas.add(l.get(i));
        }
        return askedItMihas;
    }

    public static void main (String args[]){

    }
}
