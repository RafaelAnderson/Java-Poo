package generics;

import repositorio.modelo.Cliente;
import repositorio.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Rafael", "PG"));

        Cliente rafael = clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Luci", "Martinez"), new Cliente("Rosa", "Flowgord")};
        Integer[] enterosArreglo = {1, 2, 3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Rafael", "Pepe", "Luci", "Bea", "John"}, enterosArreglo);

        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(
                new ClientePremium[]{
                        new ClientePremium("Pablo", "Fernandez")
                });

        imprimirCliente(clientes);
        imprimirCliente(clientesLista);
        imprimirCliente(clientesPremiumList);

        System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Máximo de 3.9, 11.6 y 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("Máximo de zanahoria, arándanos, manzana es: " +
                maximo("zanahoria", "arándanos", "manzana"));
    }

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g) {
        for (G elemento : g) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirCliente(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}
