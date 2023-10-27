package Tareas.Tarea21;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;
    private static int ultimoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId = ultimoId++;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String aumentarRemuneracion(int porcentaje) {
        double aumento = 0;
        if (porcentaje <= 100) {
            aumento = this.remuneracion * porcentaje / 100;
        }
        return "El aumento es de $" + aumento;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", remuneracion=" + remuneracion +
                ", empleadoId=" + empleadoId;
    }
}
