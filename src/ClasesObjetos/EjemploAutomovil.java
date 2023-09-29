package ClasesObjetos;

import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Chevrolet", "Camaro", "Blanco", 2.5); // Inicializa el objeto

        Automovil auto2 = new Automovil("Mazda", "BT-50", "Rojo", 3.0); // Inicializa el objeto

        Automovil auto3 = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50); // Inicializa el objeto

        Automovil auto4 = new Automovil("Nissan", "Navara", "Gris Oscuro", 3.5, 50); // Inicializa el objeto

        Automovil auto5 = new Automovil(); // Inicializa el objeto

        Date fecha = new Date();

        // Polimorfismo - Distintas formas de crear el objeto
        System.out.println("son iguales? " + (auto3 == auto4));
        System.out.println("son iguales? " + (auto3.equals(auto4))); // Metodo sobreescrito
        System.out.println("son iguales? " + (auto5.equals(auto4))); // NullPoint, objecto sin referencia
        System.out.println("son iguales? " + (auto5.equals(fecha))); // Error de Cast
        System.out.println(auto.verDetalle());
        System.out.println(auto2.verDetalle());
        System.out.println(auto3.verDetalle());
        System.out.println(auto.acelerarFrenar(3000));
        System.out.println("Kilómetros por litro: " + auto.calcularConsumo(300, 0.60f));
        System.out.println("Kilómetros por litro: " + auto.calcularConsumo(300, 60));
    }
}
