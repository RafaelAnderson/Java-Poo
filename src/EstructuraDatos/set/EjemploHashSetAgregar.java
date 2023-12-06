package EstructuraDatos.set;

import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs); // No es ordenado
        boolean b = hs.add("tres"); // Set no permite elementos duplicados
        System.out.println("Permite elementos duplicados = " + b);
        System.out.println(hs);

        // List
        System.out.println("\nList");
        List<String> list = new ArrayList<>(hs); // ArrayList acepta en su constructor un set
        list.add("seis");
        list.add("siete");
        list.add("ocho");
        list.add("nueve");
        list.add("diez");
        System.out.println(list);
        list.add("once");
        Collections.sort(list);
        System.out.println(list);
    }
}
