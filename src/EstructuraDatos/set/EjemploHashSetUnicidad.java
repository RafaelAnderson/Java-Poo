package EstructuraDatos.set;

import EstructuraDatos.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        //List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Lucy", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrés", 3));
        // Equals compara por referencia
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus2", 2));
        System.out.println(sa);

        System.out.println("\nIterando usando un foreach");
        for (Alumno a : sa) {
            System.out.println(a);
        }

        System.out.println("\nIterando usando while e iterador");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("\nIterando usando Stream forEach");
        sa.forEach(a -> System.out.println(a.getNombre()));
        sa.forEach(System.out::println);
    }
}
