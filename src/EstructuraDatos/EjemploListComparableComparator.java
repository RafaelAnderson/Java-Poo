package EstructuraDatos;

import EstructuraDatos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Lucy", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andrés", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));
        //Collections.sort(sa, (a, b) -> a.getNota().compareTo(b.getNota()));
        //sa.sort((a, b) -> a.getNota().compareTo(b.getNota()));
        sa.sort(Comparator.comparing(Alumno::getNota).reversed());
        System.out.println(sa);

        System.out.println("\nIterando usando Stream forEach");
        sa.forEach(System.out::println);
    }
}
