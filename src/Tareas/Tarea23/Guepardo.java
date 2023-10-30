package Tareas.Tarea23;

public class Guepardo extends Felino {
    public Guepardo(float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso) {
        super(tamanoGarras, velocidad, habitat, altura, largo, peso);
    }

    @Override
    public String comer() {
        return "El guepardo caza en solitario";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme en las sabanas africanas";
    }

    @Override
    public String correr() {
        return "El guepardo es el felino mas rápido del mundo, alcanza la velocidad de " + velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El guepardo ruge para comunicarse con los de su especie";
    }
}