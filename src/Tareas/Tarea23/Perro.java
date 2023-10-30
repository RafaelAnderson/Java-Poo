package Tareas.Tarea23;

public class Perro extends Canino {
    private final int fuerzaMordida;

    public Perro(int potenciaMordida, float tamanoColmillos, String color, String habitat, float altura, float largo, float peso) {
        super(tamanoColmillos, color, habitat, altura, largo, peso);
        this.fuerzaMordida = potenciaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }


    @Override
    public String comer() {
        return "El perro chihuahua tiene una fuerza mordida de " + fuerzaMordida + " PSI";
    }

    @Override
    public String dormir() {
        return "El perro chihuahua opta por acurrucarse al dormir";
    }

    @Override
    public String correr() {
        return "El perro chihuahua corre cuando sale de paseo";
    }

    @Override
    public String comunicarse() {
        return "Los perros chihuahua ladran al ver personas que no conocen";
    }
}
