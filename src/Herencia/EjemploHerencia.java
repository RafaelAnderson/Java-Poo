package Herencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("===== Creando la instancia de la clase Alumno =====");
        Alumno alumno = new Alumno();
        alumno.setNombre("Rafael");
        alumno.setApellido("Ponte");
        alumno.setInstitucion("UPC");
        alumno.setNotaCastellano(6.0);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(8.0);

        System.out.println("===== Creando la instancia de la clase Alumno Int =====");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Rick");
        alumnoInt.setApellido("Rud");
        alumnoInt.setPais("India");
        alumnoInt.setInstitucion("UPC");
        alumnoInt.setNotaCastellano(4.5);
        alumnoInt.setNotaHistoria(7.3);
        alumnoInt.setNotaMatematica(7.4);

        System.out.println("===== Creando la instancia de la clase Profesor =====");
        Profesor profesor = new Profesor();
        profesor.setNombre("Sora");
        profesor.setApellido("Pal");
        profesor.setAsignatura("Matemáticas");

        System.out.println("=====");
        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());

        System.out.println(alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getInstitucion()
                + " " + alumnoInt.getPais());

        System.out.println("Profesora " + profesor.getAsignatura() + ": " +
                profesor.getNombre() + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
