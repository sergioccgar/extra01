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
        teoremaFundArim(2,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        teoremaFundArim(3,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        teoremaFundArim(4,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        teoremaFundArim(5,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        teoremaFundArim(6,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        teoremaFundArim(7,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        teoremaFundArim(8,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        teoremaFundArim(9,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        teoremaFundArim(10,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        teoremaFundArim(234567,c);
        System.out.println("La lista es:");
        for (int i = 0; i < c.size(); i++){
            if (i+1 == c.size()) {
                System.out.println(c.get(i) + ".");
            } else {
                System.out.print(c.get(i) + ", ");
            }
        }
        // System.out.println("Los números It-Miha que buscas son:");
        // List<Integer> c = new ArrayList<Integer>();
        // c.add(1);
        // c.add(2);
        // c.add(4);
        // c.add(12);
        // c.add(371);
        // findMiha(371, c, b);
    }
}
