package ClasesObjetos;

public enum Color {
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    NARANJA("Naranja"),
    ROJO("Rojo"),
    VERDE("Verde");
    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
