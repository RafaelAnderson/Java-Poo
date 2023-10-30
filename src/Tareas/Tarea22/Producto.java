package Tareas.Tarea22;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", precio=" + precio;
    }
}
