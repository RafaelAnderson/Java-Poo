package Excepciones;

import javax.swing.*;

public class Ejemplo {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");

        int divisor;
        double division;
        try {
            //divisor = Integer.parseInt(valor);
            //division = cal.dividir(10, divisor);
            //System.out.println(division);
            double division2 = cal.dividir(numerador, denominador);
            System.out.println(division2);
        } catch (NumberFormatException nfe) {
            System.out.println("Se detectó una excepción: Ingrese un valor numérico");
            main(args);
        } catch (FormatoNumeroException e) {
            System.out.println("Se detectó una excepción: ingrese un valor numérico: " +
                    e.getMessage());
            e.printStackTrace(System.out);
        } catch (DivisionPorZeroException ae) {
            System.out.println("Capturamos la excepcion en tiempo de ejecucion: " + ae.getMessage());
            main(args);
        } finally { // Cerrar archivo que abre una conexión
            System.out.println("Opcional, se ejecuta con y sin excepción");
        }
        System.out.println("Continua la ejecución");
    }
}
