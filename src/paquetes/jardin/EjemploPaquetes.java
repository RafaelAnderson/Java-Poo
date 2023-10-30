package paquetes.jardin;

import Paquetes.org.rafael.app.hogar.*;

import static Paquetes.org.rafael.app.hogar.ColorPelo.*;
import static Paquetes.org.rafael.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Rafael");
        p.setApellido("Ponte");
        p.setColorPelo(NEGRO);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Bobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println(jugando);
        String saludo = saludar(); // Método estático
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
