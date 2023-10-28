package Tareas.Tarea23;

public class Leon extends Felino {
    private final int numManada;
    private final double potenciaRugidoDecibel;

    public Leon(double potenciaRugidoDecibel, int numManada, float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso) {
        super(tamanoGarras, velocidad, habitat, altura, largo, peso);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El león caza junto a su grupo de " + numManada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El león duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El león corre a " + velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El león ruge fuerte a " + potenciaRugidoDecibel + " decibeles";
    }
}
