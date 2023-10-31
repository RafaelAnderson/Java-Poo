package paquetes.jardin;

import paquetes.hogar.*;

import static paquetes.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Rafael");
        p.setApellido("Ponte");
        p.setColorPelo(ColorPelo.NEGRO);
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
