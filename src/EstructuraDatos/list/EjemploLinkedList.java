package EstructuraDatos.list;

import EstructuraDatos.modelo.Alumno;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("está vacía = " + enlazada.isEmpty());

        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Lucy", 4));
        enlazada.add(new Alumno("Jano", 7)); // Agrega en la posicion
        enlazada.add(new Alumno("Andrés", 3)); // Modifica en la posicion

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.add(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Atenea", 6));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primero = " + enlazada.getFirst());
        System.out.println("Último = " + enlazada.peekLast());
        System.out.println("Índice 2 = " + enlazada.get(2));

        //Alumno zeus1 = enlazada.removeFirst(); // Lanza excepcion si no encuentra
        //Alumno zeus2 = enlazada.pollFirst(); // Devuelve null si no se encuentra
        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.remove(new Alumno("Jano", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Lucas", 5);
        enlazada.addLast(a);
        System.out.println("Índice de Lucas = " + enlazada.indexOf(a));

        enlazada.remove(2);
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("\nList Iterator");
        ListIterator<Alumno> li = enlazada.listIterator();
        while (li.hasNext()) {
            Alumno alumno = li.next();
            System.out.println(alumno);
        }

        System.out.println("=====");
        while(li.hasPrevious()) {
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
    }
}
