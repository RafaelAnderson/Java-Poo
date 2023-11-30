package Tareas.Tarea26;

public class Fruta extends Producto {
    private double peso;
    private String color;

    public Fruta(double peso, String color, String nombre, double precio) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }
}
