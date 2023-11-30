package repositorio;

import repositorio.modelo.Cliente;
import repositorio.modelo.Producto;
import repositorio.repositorio.Direccion;
import repositorio.repositorio.FullRepositorio;
import repositorio.repositorio.lista.ClienteListRepositorio;
import repositorio.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {
        FullRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Mesa", 50.59));
        repo.crear(new Producto("Silla", 18));
        repo.crear(new Producto("Lámpara", 15.5));
        repo.crear(new Producto("Notebook", 400.99));

        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);

        System.out.println("\nPaginable:");
        List<Producto> paginable = repo.listar(1, 3);
        paginable.forEach(System.out::println);

        System.out.println("\n===== Ordenar =====");
        List<Producto> productoOrdenAsc = repo.listar("descripcion", Direccion.ASC);
        productoOrdenAsc.forEach(System.out::println);

        System.out.println("\n===== Editar =====");
        Producto productoActualizar = new Producto("Lámpara", 23);
        productoActualizar.setId(2);
        repo.editar(productoActualizar);
        Producto pro = repo.porId(2);
        System.out.println(pro);

        System.out.println("\n===== Ordenar 2 =====");
        repo.listar("apellido", Direccion.ASC).forEach(System.out::println);

        System.out.println("\n===== Eliminar =====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("\n===== Total =====");
        System.out.println("Total registros: " + repo.total());
    }
}
