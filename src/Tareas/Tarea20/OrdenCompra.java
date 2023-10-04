package Tareas.Tarea20;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdenCompra {

    private final int identificador;
    private static int ultimoId;

    private final String descripcion;
    private Date fecha;
    private Cliente cliente;
    private final Producto[] productos;
    private int indiceProductos;

    public OrdenCompra(String descripcion) {
        this.identificador = ++ultimoId;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto) {
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }

    private int totalOrdenCompra() {
        if (productos.length != 0) {
            int total = 0;
            for (Producto item : productos) {
                total += item.getPrecio();
            }
            return total;
        } else {
            return 0;
        }
    }

    public String imprimirProductos() {
        String productos = "\tProductos:\n";
        for (Producto item : this.productos) {
            productos += "\t\t" +
                    item.getFabricante() + " - " +
                    item.getNombre() + " | Precio: " +
                    item.getPrecio() + "\n";
        }
        return productos;
    }

    public String getFechaFormateada() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM 'del' yyyy");
        return dateFormat.format(this.fecha);
    }

    public String getDetalleOrdenCompra() {
        String detalle = "\n" + this.getDescripcion() +
                "\nCliente: \t" + this.cliente.getNombre() + " " + this.cliente.getApellido() +
                "\nFecha: \t\t" + this.getFechaFormateada() + "\n";
        detalle += this.imprimirProductos();
        detalle += "Total compra: " + this.totalOrdenCompra() + "\n";
        return detalle;
    }
}
