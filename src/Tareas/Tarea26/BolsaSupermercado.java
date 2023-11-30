package Tareas.Tarea26;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
    private List<T> productos;
    private int indiceProductos;
    private final int max = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public List<T> getProductos() {
        return productos;
    }

    public void addProducto(T p) {
        if (this.productos.size() <= max) {
            this.productos.add(p);
        } else {
            throw new RuntimeException("Se rompe la bolsa XD");
        }
    }
}
