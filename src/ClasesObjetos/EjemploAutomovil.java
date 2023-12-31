package ClasesObjetos;

import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Chevrolet", "Camaro", Color.BLANCO, new Motor(2.0, TipoMotor.BENCINA)); // Inicializa el objeto

        Automovil auto2 = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.0, TipoMotor.DIESEL));

        Automovil auto3 = new Automovil("Nissan", "Navara", Color.AMARILLO, new Motor(2.0, TipoMotor.BENCINA), new Estanque(50));

        Automovil auto4 = new Automovil("Nissan", "Navara", Color.ROJO, new Motor(2.0, TipoMotor.BENCINA), new Estanque(50));

        Automovil auto5 = new Automovil(); // Inicializa el objeto

        Date fecha = new Date();

        // Polimorfismo - Distintas formas de crear el objeto
        System.out.println("son iguales? " + (auto3 == auto4));
        System.out.println("son iguales? " + (auto3.equals(auto4))); // Metodo sobreescrito
        System.out.println("son iguales? " + (auto5.equals(auto4))); // NullPoint, objecto sin referencia
        System.out.println("son iguales? " + (auto5.equals(fecha))); // Error de Cast
        System.out.println(auto3);
        System.out.println(auto3.toString());
        System.out.println(auto.verDetalle());
        System.out.println(auto2.verDetalle());
        System.out.println(auto3.verDetalle());
        System.out.println(auto.acelerarFrenar(3000));
        System.out.println("Kilómetros por litro: " + auto.calcularConsumo(300, 0.60f));
        System.out.println("Kilómetros por litro: " + auto.calcularConsumo(300, 60));
    }
}
