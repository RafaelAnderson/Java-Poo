package Sobrecarga;
import static Sobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        // Calculadora cal = new Calculadora();
        // Método static se llama por el nombre de la clase

        System.out.println("sumar int: " + sumar(10, 5));
        System.out.println("sumar float: " + sumar(10.0f, 5f));
        System.out.println("sumar float-int: " + Calculadora.sumar(10.0f, 5));
        System.out.println("sumar int-float: " + Calculadora.sumar(10, 5.0f));
        System.out.println("sumar double: " + Calculadora.sumar(10.0, 5.0));
        System.out.println("sumar string: " + Calculadora.sumar("10", "5"));
        System.out.println("sumar tres int: " + Calculadora.sumar(10, 5, 3));
        System.out.println("sumar 4 int: " + Calculadora.sumar(10, 5, 2, 4));
        System.out.println("sumar 5 int: " + Calculadora.sumar(10, 5, 2, 4, 20));
        System.out.println("sumar float + 'n' int: " + Calculadora.sumar(5f, 10, 5, 2, 4, 20));
        System.out.println("sumar 4 double: " + Calculadora.sumar(10.0, 5.0, 3.0, 4.5));

        System.out.println("sumar long: " + Calculadora.sumar(10L, 5L));
        System.out.println("sumar int: " + Calculadora.sumar(10, '@'));
        System.out.println("sumar float-int: " + Calculadora.sumar(10F, '@'));
    }
}
