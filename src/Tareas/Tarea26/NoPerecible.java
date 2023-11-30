package Tareas.Tarea26;

public class NoPerecible extends Producto {
    private int contenido;
    private int calorias;

    public NoPerecible(int contenido, int calorias, String nombre, double precio) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }
}
