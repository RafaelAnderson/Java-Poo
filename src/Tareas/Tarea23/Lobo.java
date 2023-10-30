package Tareas.Tarea23;

public class Lobo extends Canino {
    private final int numCamada;
    private final String especieLobo;

    public Lobo(int numCamada, String especieLobo, float tamanoColmillos, String color, String habitat, float altura, float largo, float peso) {
        super(tamanoColmillos, color, habitat, altura, largo, peso);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    @Override
    public String comer() {
        return "El lobo " + especieLobo + " caza junto a su grupo de " + numCamada + " individuos en los bosques de " + habitat;
    }

    @Override
    public String dormir() {
        return "El lobo " + color + " duerme en las cavernas de " + habitat;
    }

    @Override
    public String correr() {
        return "El lobo " + especieLobo + " suele correr de las personas porque se encuentra amenazado en " + habitat;
    }

    @Override
    public String comunicarse() {
        return "El lobo " + especieLobo + ", el cual es de color " + color + ", aulla en luna llena";
    }
}
