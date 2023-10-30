package Tareas.Tarea21;

public class Company {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Rafael", "Anderson", "987654", "Av. Los Programadores 404");
        empleado.setRemuneracion(1000.0);

        Gerente gerente = new Gerente("Claudia", "Cher", "123456", "Av. California 102");
        gerente.setRemuneracion(5000.0);
        gerente.setPresupuesto(1000000.0);

        System.out.println(empleado);
        System.out.println(gerente);

        System.out.println(empleado.aumentarRemuneracion(10));
    }
}
