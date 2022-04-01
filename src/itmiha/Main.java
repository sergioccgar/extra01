import java.util.*;
import java.io.IOException;

public class Main {

    public static List agregarALaLista(List<Integer> a){
        Scanner scn = new Scanner(System.in);
        do {
            a.add(Integer.parseInt(scn.nextLine()));
        } while (scn.hasNextLine());
        return a;
    }

    public static Integer getLastItMiha(List <Integer> a){
        a.remove(0);
        Integer max = Collections.max(a);
        return max;
    }

    public static void main (String args[]){

    }
}
