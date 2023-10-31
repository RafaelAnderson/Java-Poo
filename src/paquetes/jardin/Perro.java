package paquetes.jardin;

import paquetes.hogar.Persona;

public class Perro {
    protected String nombre; // Funciona como herencia
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}
