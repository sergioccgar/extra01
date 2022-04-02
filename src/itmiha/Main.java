import java.util.*;
import java.io.IOException;

/**
 * Primer ejercicio extra de Laboratorio de la clase Modelado y Programación
 *
 * It-Miha No. 1338
 *
 * @author Sergio Medina Guzmán 3143232428
 */

public class Main {

    /**
     * Método que calcula los primeros ? cuadrados perfectos.
     *
     * @param l Lista donde se guardarán los cuadrados perfectos.
     */
    public static List<Long> findSquares(List<Long> l) {
        long k;
        long fi = 2000000;
        for (long i = 2; i <= fi; i++){
            k = Long.valueOf(i);
            l.add(k*k);
        }
        return l;
    }

    /**
     * Método que revisa si un número es It-Miha, viendo si es divisible
     * por alguno de los cuadrados perfectos almacenados en una lista.
     *
     * @param n Número a revisar.
     * @param squares Lista con cuadrados perfectos.
     *
     */
    public static boolean isItMiha(long n, List<Long> squares) {
        List<Long> l = new ArrayList<Long>();
        boolean t = true;
        if (n == 1 || n == 2 || n == 3){
            return t;
        } else {
            for (long i: squares) {
                if (n%i == 0) t = false;
                if (t == false) break;
            }
        }
        return t;
        }

    /**
     * Método que revisa si un número es It-Miha viendo si la operación módulo
     * con cuadrados perfectos es 0 o no. Devuelve true si es It-Miha y false si
     * no.
     *
     * @param n Número a revisar.
     *
     */
    public static boolean isItMiha2(long n) {
        boolean t = true;
        long i = 2;
        if (n == 1){
            return true;
        } else {
            while (t == true && (i*i) <= n){
                if (n%(i*i)==0) t = false;
                i++;
            }
        }
        return t;
    }

    /**
     * Método que agrega los números del input a una lista. No considera
     * repeticiones, salvo el primer número.
     *
     * @param a Lista vacía por llenar
     */
    public static List agregarALaLista(List<Long> a){
        Scanner scn = new Scanner(System.in);
        long first = Long.parseLong(scn.nextLine());
        while (scn.hasNextLine()) {
            a.add(Long.parseLong(scn.nextLine()));
        }
        return a;
    }

    /**
     * Método que revisa cuál es el número It-Miha más alto que buscamos
     * (es el último de la lista).
     *
     * @param a Lista a revisar
     */
    public static long getLastItMiha(List<Long> a){
        return a.get(a.size()-1);
    }

    /**
     * Método que consigue todos los primeros n números It-Miha.
     *
     * @param n Último número It-Miha a conseguir.
     *
     */

     public static List<Long> findFirstnMihas(long n, List<Long> l){
         long contador = 0;
         long i = 1;
         List<Long> mihas = new ArrayList<Long>();
         mihas.add(Long.valueOf(-1));
         while (contador < n) {
             if (!isItMiha(i,l)){
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

    public static List<Long> giveMeSumItMihas(List<Long> l, List<Long> m) {
        List<Long> askedItMihas = new ArrayList<Long>();
        for (long i: m){
            askedItMihas.add(l.get((int)i));
        }
        return askedItMihas;
    }

    public static void main (String args[]) throws IOException {
        List<Long> a = new ArrayList<Long>();
        List<Long> squares = new ArrayList <Long>();
        findSquares(squares);
        System.out.println("k");
        agregarALaLista(a);
        long maxMiha = getLastItMiha(a);
        List<Long> mihas = findFirstnMihas(maxMiha, squares);
        List<Long> askedItMihas = giveMeSumItMihas(mihas, a);
        for (int i = 0; i < askedItMihas.size(); i++){
            System.out.println(askedItMihas.get(i));
        }
    }
}
