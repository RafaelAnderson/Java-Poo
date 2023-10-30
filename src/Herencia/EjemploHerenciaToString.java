package Herencia;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        System.out.println("===== Creando la instancia de la clase Alumno =====");
        Alumno alumno = new Alumno("Rafael", "Ponte", 26, "UPC");
        alumno.setNotaCastellano(6.0);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(8.0);
        alumno.setEmail("rafael@correo.com");

        System.out.println("===== Creando la instancia de la clase Alumno Int =====");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Rick", "Rud", "India");
        alumnoInt.setInstitucion("UPC");
        alumnoInt.setNotaCastellano(4.5);
        alumnoInt.setNotaHistoria(7.3);
        alumnoInt.setNotaMatematica(7.4);
        alumnoInt.setEmail("rick@correo.com");

        System.out.println("===== Creando la instancia de la clase Profesor =====");
        Profesor profesor = new Profesor("Sora", "Pal", "Matemáticas");
        profesor.setEdad(30);
        profesor.setEmail("sora@correo.com");

        System.out.println("Profesora " + profesor.getAsignatura() + ": " +
                profesor.getNombre() + " " + profesor.getApellido());

        System.out.println("=====");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println(persona);
    }
}