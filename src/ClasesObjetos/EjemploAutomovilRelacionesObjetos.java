package ClasesObjetos;

public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductor1 = new Persona("Luci", "Martinez");
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil auto = new Automovil("Chevrolet", "Camaro", Color.AMARILLO, new Motor(2.0, TipoMotor.BENCINA)); // Inicializa el objeto
        auto.setTipo(TipoAutomovil.HATCHBACK);
        auto.setConductor(conductor1);
        //auto.setRuedas(ruedas1);
        Rueda[] ruedas1 = new Rueda[5];
        for (int i = 0; i < ruedas1.length; i++) {
            auto.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona conductor2 = new Persona("Pato", "Rodriguez");
        Automovil auto2 = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.0, TipoMotor.BENCINA)); // Inicializa el objeto
        auto2.setTipo(TipoAutomovil.PICKUP);
        auto2.setConductor(conductor2);
        //auto2.setRuedas(ruedas2);
        Rueda[] ruedas2 = new Rueda[5];
        for (int i = 0; i < ruedas2.length; i++) {
            auto2.addRueda(new Rueda("Michelin", 16, 7.5));
        }

        Persona conductor3 = new Persona("Bea", "Gonzalez");
        Automovil auto3 = new Automovil("Nissan", "Navara", Color.AZUL, new Motor(2.0, TipoMotor.BENCINA), new Estanque(50)); // Inicializa el objeto
        auto3.setTipo(TipoAutomovil.PICKUP);
        auto3.setConductor(conductor3);
        //auto3.setRuedas(ruedas3);
        Rueda[] ruedas3 = new Rueda[5];
        for (int i = 0; i < ruedas3.length; i++) {
            auto3.addRueda(new Rueda("Pirelli", 16, 7.5));
        }

        System.out.println(auto.verDetalle());
        System.out.println(auto2.verDetalle());
        System.out.println(auto3.verDetalle());
    }
}
