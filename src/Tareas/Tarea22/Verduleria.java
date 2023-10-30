package Tareas.Tarea22;

public class Verduleria {
    public static void main(String[] args) {
        Lacteo l1 = new Lacteo("Queso bonle", 5.5, 3, 20);
        Lacteo l2 = new Lacteo("Leche fresca", 6.5, 2, 60);

        Fruta f1 = new Fruta("Plátano", 1.2, 0.3, "amarillo");
        Fruta f2 = new Fruta("Mandarina", 0.7, 0.2, "naranja");

        Limpieza lim1 = new Limpieza("Limpiador Poett", 4.5, "Lavanda", 1.5);
        Limpieza lim2 = new Limpieza("Enjuague", 15.5, "Lavanda", 2.5);

        NoPerecible np1 = new NoPerecible("Atún", 5.5, 500, 20);
        NoPerecible np2 = new NoPerecible("Aceitunas", 8.0, 1000, 60);

        Producto[] arreglo = new Producto[8];
        arreglo[0] = l1;
        arreglo[1] = l2;
        arreglo[2] = f1;
        arreglo[3] = f2;
        arreglo[4] = lim1;
        arreglo[5] = lim2;
        arreglo[6] = np1;
        arreglo[7] = np2;

        for (Producto producto : arreglo) {
            System.out.println(producto.toString());
        }
    }
}
