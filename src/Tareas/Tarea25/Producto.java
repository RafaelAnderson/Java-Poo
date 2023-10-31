package Tareas.Tarea25;

public abstract class Producto implements IProducto {

    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
