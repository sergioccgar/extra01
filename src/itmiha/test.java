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
        List<Integer> b = new ArrayList<Integer>();
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
        System.out.println("La lista es:");
        for (int i = 0; i < a.size(); i++){
            if (i+1 == a.size()) {
                System.out.println(a.get(i) + ".");
            } else {
                System.out.print(a.get(i) + ", ");
            }
        }
        List<Integer> c = new ArrayList<Integer>();
        System.out.println("Teorema Fundamental de la Aritmética");
        teoremaFundArim(1,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        System.out.println("La descomposición factorial tiene valores repetidos: " + hayRepes(c));
        teoremaFundArim(2,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        System.out.println("La descomposición factorial tiene valores repetidos: " + hayRepes(c));
        teoremaFundArim(3,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        System.out.println("La descomposición factorial tiene valores repetidos: " + hayRepes(c));
        teoremaFundArim(4,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        System.out.println("La descomposición factorial tiene valores repetidos: " + hayRepes(c));
        teoremaFundArim(5,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        System.out.println("La descomposición factorial tiene valores repetidos: " + hayRepes(c));
        teoremaFundArim(6,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        System.out.println("La descomposición factorial tiene valores repetidos: " + hayRepes(c));
        teoremaFundArim(7,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        System.out.println("La descomposición factorial tiene valores repetidos: " + hayRepes(c));
        teoremaFundArim(8,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        System.out.println("La descomposición factorial tiene valores repetidos: " + hayRepes(c));
        teoremaFundArim(9,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        System.out.println("La descomposición factorial tiene valores repetidos: " + hayRepes(c));
        teoremaFundArim(10,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        System.out.println("La descomposición factorial tiene valores repetidos: " + hayRepes(c));
        teoremaFundArim(234567,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        System.out.println("La descomposición factorial tiene valores repetidos: " + hayRepes(c));
        System.out.println("La lista es:");
        c = teoremaFundArim2(234567);
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        System.out.println("La descomposición factorial tiene valores repetidos: " + hayRepes(c));
        // System.out.println("Los números It-Miha que buscas son:");
        List<Integer> mix = new ArrayList<Integer>();
        // mix.add(10);
        // mix.add(1);
        // mix.add(2);
        // mix.add(3);
        // mix.add(4);
        // mix.add(5);
        // mix.add(6);
        // mix.add(7);
        // mix.add(8);
        // mix.add(9);
        // mix.add(10);
        // mix = findMihas(getLastItMiha(mix), mix);
        // for (int i = 0; i < mix.size(); i++){
        //     if (i+1 == mix.size()) {
        //         System.out.println(mix.get(i) + ".");
        //     } else {
        //         System.out.print(mix.get(i) + ", ");
        //     }
        // }
        // mix.clear();
        // mix.add(5);
        // mix.add(1);
        // mix.add(2);
        // mix.add(4);
        // mix.add(12);
        // mix.add(371);
        // mix = findMihas(getLastItMiha(mix), mix);
        // for (int i = 0; i < mix.size(); i++){
        //     if (i+1 == mix.size()) {
        //         System.out.println(mix.get(i) + ".");
        //     } else {
        //         System.out.print(mix.get(i) + ", ");
        //     }
        // }
        System.out.println("Los primeros 10 números it-miha son: ");
        mix = findFirstnMihas(10);
        for (int i = 0; i < mix.size(); i++){
            if (i+1 == mix.size()) {
                System.out.println(mix.get(i) + ".");
            } else {
                System.out.print(mix.get(i) + ", ");
            }
        }
        System.out.println("Los números it-miha que pediste son:");
        mix.clear();
        mix.add(5);
        mix.add(1);
        mix.add(2);
        mix.add(4);
        mix.add(12);
        mix.add(371);
        List<Integer> firstN = findFirstnMihas(getLastItMiha(mix));
        List<Integer> finale = giveMeSumItMihas(firstN,mix);
        for (int i = 0; i < finale.size(); i++){
            if (i+1 == finale.size()) {
                System.out.println(finale.get(i) + ".");
            } else {
                System.out.print(finale.get(i) + ", ");
            }
        }


    }
}
