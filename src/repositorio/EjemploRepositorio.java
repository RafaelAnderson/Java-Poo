package repositorio;

import repositorio.modelo.Cliente;
import repositorio.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        FullRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Pérez"));
        repo.crear(new Cliente("Bea", "González"));
        repo.crear(new Cliente("Luci", "Martínez"));
        repo.crear(new Cliente("Andrés", "Guzmán"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("\nPaginable:");
        List<Cliente> paginable = repo.listar(1, 3);
        paginable.forEach(System.out::println);

        System.out.println("\n===== Ordenar =====");
        List<Cliente> clienteOrdenAsc = repo.listar("nombre", Direccion.ASC);
        clienteOrdenAsc.forEach(System.out::println);

        System.out.println("\n===== Editar =====");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);

        System.out.println("\n===== Ordenar 2 =====");
        repo.listar("apellido", Direccion.ASC).forEach(System.out::println);

        System.out.println("\n===== Eliminar =====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("\n===== Total =====");
        System.out.println("Total registros: " + repo.total());
    }
}
