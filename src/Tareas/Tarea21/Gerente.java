package Tareas.Tarea21;

public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + ", presupuesto=" + presupuesto;
    }
}
