package ClasesObjetos;

import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductor1 = new Persona("Luci", "Martinez");
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil auto1 = new Automovil("Chevrolet", "Camaro", Color.AMARILLO, new Motor(2.0, TipoMotor.BENCINA));
        auto1.setTipo(TipoAutomovil.HATCHBACK);
        auto1.setConductor(conductor1);

        Persona conductor2 = new Persona("Pato", "Rodriguez");
        Automovil auto2 = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.0, TipoMotor.BENCINA));
        auto2.setTipo(TipoAutomovil.PICKUP);
        auto2.setConductor(conductor2);

        Persona conductor3 = new Persona("Bea", "Gonzalez");
        Automovil auto3 = new Automovil("Nissan", "Navara", Color.AZUL, new Motor(2.0, TipoMotor.BENCINA), new Estanque(50));
        auto3.setTipo(TipoAutomovil.PICKUP);
        auto3.setConductor(conductor3);

        Persona conductor4 = new Persona("Lel", "Douglas");
        Automovil auto4 = new Automovil("Suzuki", "Vitara", Color.AZUL, new Motor(2.0, TipoMotor.BENCINA), new Estanque(50));
        auto4.setTipo(TipoAutomovil.PICKUP);
        auto4.setConductor(conductor4);

        Persona conductor5 = new Persona("Pri", "Bastian");
        Automovil auto5 = new Automovil("Audi", "A3", Color.VERDE, new Motor(2.0, TipoMotor.BENCINA), new Estanque(50));
        auto5.setTipo(TipoAutomovil.PICKUP);
        auto5.setConductor(conductor5);

        Automovil[] autos = new Automovil[5];
        autos[0] = auto1;
        autos[1] = auto2;
        autos[2] = auto3;
        autos[3] = auto4;
        autos[4] = auto5;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }
    }
}
