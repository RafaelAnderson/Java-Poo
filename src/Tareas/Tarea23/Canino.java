package Tareas.Tarea23;

abstract public class Canino extends Mamifero {
    protected String color;
    protected float tamanoColmillos;

    public Canino(float tamanoColmillos, String color, String habitat, float altura, float largo, float peso) {
        super(habitat, altura, largo, peso);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
