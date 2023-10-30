package paquetes.jardin;

import Paquetes.org.rafael.app.hogar.Persona;

public class Perro {
    protected String nombre; // Funciona como herencia
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}
