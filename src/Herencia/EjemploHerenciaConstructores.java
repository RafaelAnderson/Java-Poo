package Herencia;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo los datos del tipo Persona:");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno:");
            System.out.println("institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("nota matemática: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("nota castellano: " + ((Alumno) persona).getNotaCastellano());
            System.out.println("nota historia: " + ((Alumno) persona).getNotaHistoria());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo los datos del tipo Alumno Internacional:");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
            }

            System.out.println("========== Sobre escritura promedio");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
        }

        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo los datos del tipo Profesor:");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("========== Sobre escritura saludar");
        System.out.println(persona.saludar());
        System.out.println("==========");
    }
}