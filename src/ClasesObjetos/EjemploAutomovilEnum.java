package ClasesObjetos;

public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Chevrolet", "Camaro", Color.AMARILLO, 2.5); // Inicializa el objeto
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0); // Inicializa el objeto
        mazda.setTipo(TipoAutomovil.PICKUP);

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo Subaru: " + tipo.getNombre());
        System.out.println("tipo desc. Subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable de 2 puertas");
                break;
            case COUPE:
                System.out.println("Es un automóvil pequeño de 2 puertas y típicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automóvil utilitario de transporte, de empresas");
                break;
            case HATCHBACK:
                System.out.println("Es un automóvil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un automóvil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un automóvil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automóvil más grande, con maleta grande");
                break;
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta: tipos) {
            System.out.print(ta + " => " + ta.name() + ", " + ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " + ta.getNumeroPuertas());
            System.out.println();
        }
    }
}
