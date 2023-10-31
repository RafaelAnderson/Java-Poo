package Tareas.Tarea25;

public class Proyecto {
    public static void main(String[] args) {
        IProducto[] productos = new Producto[4];

        productos[0] = new Iphone(6500, "Apple", "13 Pro Max", "Plata");
        productos[1] = new TvLcd(2100, "Samsung", 55);
        productos[2] = new Libro(80, "Mario Vargas Llosa", "La casa verde", "Debolsillo");
        productos[3] = new Comics(50, "Mavel", "Spiderma", "Marvel", "Spiderman");

        for (IProducto producto : productos) {

            System.out.print("Producto: " + producto.getClass().getName() + "\n");
            System.out.print("Precio: " + producto.getPrecio() + "\n");
            System.out.print("Precio final: " + producto.getPrecioVenta() + "\n");

            if (producto instanceof IElectronico) {
                System.out.print("Fabricante: " + ((IElectronico) producto).getFabricante() + "\n");

                if (producto instanceof Iphone) {
                    System.out.print("Modelo: " + ((Iphone) producto).getModelo() + "\n");
                    System.out.print("Color: " + ((Iphone) producto).getColor() + "\n");
                }

                if (producto instanceof TvLcd) {
                    System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgada() + "\n");
                }
            }

            if (producto instanceof ILibro) {
                System.out.print("Titulo: " + ((ILibro) producto).getTitulo() + "\n");
                System.out.print("Autor: " + ((ILibro) producto).getAutor() + "\n");
                System.out.print("Editorial: " + ((ILibro) producto).getEditorial() + "\n");
                System.out.print("Fecha de publicación: " + ((ILibro) producto).getFechaPublicacion() + "\n");

                if (producto instanceof Comics) {
                    System.out.print("Personaje: " + ((Comics) producto).getPersonaje() + "\n");
                }
            }
            System.out.println();
        }
    }
}
