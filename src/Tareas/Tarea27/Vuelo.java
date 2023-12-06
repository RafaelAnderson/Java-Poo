package Tareas.Tarea27;

import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaHora;
    private int cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaHora, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaHora = fechaHora;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    static String obtenerFormatoCabecera() {
        return String.format("%-" + (14) + "s%-" + (20) + "s%-" + (20) + "s%-" + (34) + "s%" + "s",
                "Vuelo", "Origen", "Destino", "Fecha y hora de llegada", "Num pasajeros");
    }

    @Override
    public String toString() {
        String formato = "%-" + (14) + "s%-" + (20) + "s%-" + (20) + "s%-" + (34) + "s%" + "s";

        return String.format(formato, nombre, origen, destino, fechaHora, cantidadPasajeros);
    }
}
