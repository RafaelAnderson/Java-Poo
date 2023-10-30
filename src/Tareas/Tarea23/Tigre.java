package Tareas.Tarea23;

public class Tigre extends Felino {
    private final String especieTigre;

    public Tigre(String especieTigre, float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso) {
        super(tamanoGarras, velocidad, habitat, altura, largo, peso);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre " + especieTigre + " casa en solitario en " + habitat;
    }

    @Override
    public String dormir() {
        return "El Tigre " + especieTigre + " duerme en la selvas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Tigre " + especieTigre + " corre a " + velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El tigre ruge para comunicarse";
    }
}
