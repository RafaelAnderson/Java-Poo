package Tareas.Tarea21;

public class Cliente extends Persona {
    private int clienteId;
    private static int ultimoId;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ultimoId++;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "clienteId=" + clienteId;
    }
}
