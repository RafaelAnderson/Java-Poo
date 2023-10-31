package Tareas.Tarea25;

public class Iphone extends Electronico {

    private String modelo;
    private String color;

    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.9;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }
}
