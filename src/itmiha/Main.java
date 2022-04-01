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
     * Método que descompone un número en sus factores primos y agrega a estos
     * a una lista. Para cuando hay una repetición en la factorización. Devuelve
     * false si no hay factores repetidos y true si sí los hay.
     *
     * @param n Número a descomponer
     *
     */
    public static boolean isItMiha(long n) {
        List<Long> l = new ArrayList<Long>();
        long cociente = -1;
        boolean t = true;
        if (n == 1){
            return true;
        } else {
            long i = 2;
            while (cociente != 1 && t == true){
                if (n%i == 0) {
                    cociente = n = n / i;
                    if (l.contains(i)) t = false;
                    l.add(i);
                } else i++;
            }
            return t;
        }
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

     public static List<Long> findFirstnMihas(long n){
         long contador = 0;
         long i = 1;
         List<Long> mihas = new ArrayList<Long>();
         mihas.add(Long.valueOf(-1));
         while (contador < n) {
             if (!isItMiha(i)){
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
        agregarALaLista(a);
        long maxMiha = getLastItMiha(a);
        List<Long> mihas = findFirstnMihas(maxMiha);
        List<Long> askedItMihas = giveMeSumItMihas(mihas, a);
        for (int i = 0; i < askedItMihas.size(); i++){
            System.out.println(askedItMihas.get(i));
        }
    }
}
