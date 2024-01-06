package Tareas.Tarea34;

import java.util.Arrays;
import java.util.List;

public class PrincipalClass {
    public static void main(String[] args) {
        Product product1 = new Product(3.59, 4);
        Product product2 = new Product(24.89, 5);
        Product product3 = new Product(120.19, 2);
        Product product4 = new Product(1.99, 6);
        Product product5 = new Product(10.59, 2);

        List<Product> list = Arrays.asList(product1, product2, product3, product4, product5);
        double total = list.stream().mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();

        System.out.println("El total por la compra es: " + total + "$");
    }
}
