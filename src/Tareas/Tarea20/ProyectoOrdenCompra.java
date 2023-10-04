package Tareas.Tarea20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProyectoOrdenCompra {
    public static void main(String[] args) throws ParseException {
        //Fechas
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha1 = dateFormat.parse("01/10/2023");
        Date fecha2 = dateFormat.parse("02/10/2023");
        Date fecha3 = dateFormat.parse("03/10/2023");

        // Clientes
        Cliente cliente1 = new Cliente("Rosa", "Lemar");
        Cliente cliente2 = new Cliente("Brenda", "Wilcons");
        Cliente cliente3 = new Cliente("Lena", "Brand");

        //Productos
        Producto epp1 = new Producto("3M", "Guantes de nitrilo", 13);
        Producto epp2 = new Producto("3M", "Mascará antigases", 53);
        Producto epp3 = new Producto("SteelPro", "Guantes de cuero", 8);
        Producto epp4 = new Producto("SteelPro", "Guantes multiflex", 9);
        Producto electronico1 = new Producto("Samsung", "Galaxy Fold Z5", 5100);
        Producto electronico2 = new Producto("Samsung", "Tv Samsung 4K", 2400);
        Producto electronico3 = new Producto("Panasonic", "Audífonos", 150);
        Producto electronico4 = new Producto("Panasonic", "Parlante personal", 340);
        Producto computadora1 = new Producto("Antryx", "Fuente de poder Antryx 700W", 570);
        Producto computadora2 = new Producto("Asus", "Monitor 27 pulgadas", 1560);
        Producto computadora3 = new Producto("Redragon", "Teclado RGB", 420);
        Producto computadora4 = new Producto("Logitech", "Mouse RGB", 160);

        // Orden de compra
        OrdenCompra ordenCompra1 = new OrdenCompra("Compra de Epp's");
        ordenCompra1.setFecha(fecha1);
        ordenCompra1.setCliente(cliente1);
        ordenCompra1.addProducto(epp1);
        ordenCompra1.addProducto(epp2);
        ordenCompra1.addProducto(epp3);
        ordenCompra1.addProducto(epp4);
        System.out.println(ordenCompra1.getDetalleOrdenCompra());

        OrdenCompra ordenCompra2 = new OrdenCompra("Compra de dispositivos electrónicos");
        ordenCompra2.setFecha(fecha2);
        ordenCompra2.setCliente(cliente2);
        ordenCompra2.addProducto(electronico1);
        ordenCompra2.addProducto(electronico2);
        ordenCompra2.addProducto(electronico3);
        ordenCompra2.addProducto(electronico4);
        System.out.println(ordenCompra2.getDetalleOrdenCompra());

        OrdenCompra ordenCompra3 = new OrdenCompra("Compra de partes de PC");
        ordenCompra3.setFecha(fecha3);
        ordenCompra3.setCliente(cliente3);
        ordenCompra3.addProducto(computadora1);
        ordenCompra3.addProducto(computadora2);
        ordenCompra3.addProducto(computadora3);
        ordenCompra3.addProducto(computadora4);
        System.out.println(ordenCompra3.getDetalleOrdenCompra());
    }
}
