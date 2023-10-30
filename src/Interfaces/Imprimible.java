package Interfaces;

public interface Imprimible {
    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    default String imprimir() {
        return TEXTO_DEFECTO;
    }
}
