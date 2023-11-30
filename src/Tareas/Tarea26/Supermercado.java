package Tareas.Tarea26;

public class Supermercado {
    public static void main(String[] args) {

        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();

        bolsaLacteos.addProducto(new Lacteo(2, 32, "Queso", 2.5));
        bolsaLacteos.addProducto(new Lacteo(5, 140, "Yogurt de vainilla", 6.50));
        bolsaLacteos.addProducto(new Lacteo(7, 110, "Leche fresca", 4.50));
        bolsaLacteos.addProducto(new Lacteo(3, 130, "Leche chocolatada", 4.20));
        bolsaLacteos.addProducto(new Lacteo(20, 60, "Mantequilla", 2.40));

        bolsaFrutas.addProducto(new Fruta(1000, "Roja", "Manzana", 4.00));
        bolsaFrutas.addProducto(new Fruta(1000, "Verde", "Manzana", 4.50));
        bolsaFrutas.addProducto(new Fruta(3500, "Anaranjada", "Mandarina", 7.5));
        bolsaFrutas.addProducto(new Fruta(2000, "Amarilla", "Papaya", 8.0));
        bolsaFrutas.addProducto(new Fruta(4000, "Roja", "sandia", 20.0));

        bolsaLimpieza.addProducto(new Limpieza("Cloro", 0.5, "Clorox", 1.70));
        bolsaLimpieza.addProducto(new Limpieza("Alcohol", 2.5, "Desinfectante", 10));
        bolsaLimpieza.addProducto(new Limpieza("Alcohol", 4.0, "Limpiatodo", 12));
        bolsaLimpieza.addProducto(new Limpieza("Alcohol", 1.0, "Gel antibacterial", 15));
        bolsaLimpieza.addProducto(new Limpieza("Propanol", 2.0, "Alcohol isopropilico", 13));

        bolsaNoPerecible.addProducto(new NoPerecible(200, 100, "Atún", 4.5));
        bolsaNoPerecible.addProducto(new NoPerecible(400, 120, "Coctel de frutas", 9.7));
        bolsaNoPerecible.addProducto(new NoPerecible(300, 140, "Sopa", 4.6));
        bolsaNoPerecible.addProducto(new NoPerecible(150, 110, "Duraznos", 8.9));
        bolsaNoPerecible.addProducto(new NoPerecible(170, 90, "Damasco", 24.5));

        System.out.println("*** Lacteos: ");
        for (Lacteo prod : bolsaLacteos.getProductos()) {
            System.out.println("> " + prod.getNombre());
            System.out.println("\tPrecio: " + prod.getPrecio());
            System.out.println("\tCantidad (gr/cc): " + prod.getCantidad());
            System.out.println("\tProteinas (gr): " + prod.getProteinas());
        }

        System.out.println("\n*** Frutas");
        for (Fruta fruta : bolsaFrutas.getProductos()) {
            System.out.println("> " + fruta.getNombre());
            System.out.println("\tPrecio: " + fruta.getPrecio());
            System.out.println("\tPeso (gr): " + fruta.getPeso());
            System.out.println("\tColor: " + fruta.getColor());
        }

        System.out.println("\n*** Limpieza");
        for (Limpieza prod : bolsaLimpieza.getProductos()) {
            System.out.println("> " + prod.getNombre());
            System.out.println("\tPrecio: " + prod.getPrecio());
            System.out.println("\tComponentes: " + prod.getComponentes());
            System.out.println("\tLitros: " + prod.getLitros());
        }

        System.out.println("\n*** No perecible");
        for (NoPerecible prod : bolsaNoPerecible.getProductos()) {
            System.out.println("> " + prod.getNombre());
            System.out.println("\tPrecio: " + prod.getPrecio());
            System.out.println("\tCalorias (kCal): " + prod.getCalorias());
            System.out.println("\tContenido neto (gr): " + prod.getContenido());
        }
    }
}
