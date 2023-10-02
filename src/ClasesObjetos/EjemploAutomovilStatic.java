package ClasesObjetos;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil auto = new Automovil("Chevrolet", "Camaro", Color.AMARILLO, new Motor(2.0, TipoMotor.BENCINA)); // Inicializa el objeto
        auto.setTipo(TipoAutomovil.HATCHBACK);

        Automovil auto2 = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.0, TipoMotor.BENCINA)); // Inicializa el objeto
        auto2.setTipo(TipoAutomovil.PICKUP);

        Automovil auto3 = new Automovil("Nissan", "Navara", Color.AZUL, new Motor(2.0, TipoMotor.BENCINA), new Estanque(50)); // Inicializa el objeto
        auto3.setTipo(TipoAutomovil.PICKUP);

        Automovil.setColorPatente(Color.VERDE); // Pertenece a la clase, no a una instancia
        System.out.println(auto.verDetalle());
        System.out.println(auto2.verDetalle());
        System.out.println(auto3.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("kilómetros por litros = " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Velocidad máxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);
    }
}
