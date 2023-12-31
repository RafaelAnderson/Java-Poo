package Hilos.ejemploSync;

import Hilos.ejemploSync.Panaderia;
import Hilos.ejemploSync.runnable.Consumidor;
import Hilos.ejemploSync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
