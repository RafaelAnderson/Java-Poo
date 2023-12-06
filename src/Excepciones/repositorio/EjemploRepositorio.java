package Excepciones.repositorio;

import Excepciones.repositorio.modelo.Cliente;
import Excepciones.repositorio.repositorio.Direccion;
import Excepciones.repositorio.repositorio.FullRepositorio;
import Excepciones.repositorio.repositorio.excepciones.AccesoDatoException;
import Excepciones.repositorio.repositorio.excepciones.EscrituraAccesoDatoException;
import Excepciones.repositorio.repositorio.excepciones.LecturaAccesoDatoException;
import Excepciones.repositorio.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import Excepciones.repositorio.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        try {
            FullRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Jano", "Pérez"));
            repo.crear(new Cliente("Bea", "González"));
            repo.crear(new Cliente("Luci", "Martínez"));
            repo.crear(new Cliente("Andrés", "Guzmán"));
            repo.crear(new Cliente("Andrés", "Guzmán"));

            //repo.crear(null);

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
        } catch (RegistroDuplicadoAccesoDatoException e) {
            System.out.println("Registro duplicado: " + e.getMessage());
            e.printStackTrace();
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e) {
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println("Genérica: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
