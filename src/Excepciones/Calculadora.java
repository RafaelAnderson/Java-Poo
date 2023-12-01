package Excepciones;

public class Calculadora {
    public double dividir(int dividendo, int divisor) throws DivisionPorZeroException {
        if (divisor == 0) {
            throw new DivisionPorZeroException("No se puede dividir por cero");
        }
        return dividendo / (double) divisor;
    }

    public double dividir(String numerador, String denominador) throws DivisionPorZeroException,
            FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int den = Integer.parseInt(denominador);
            return this.dividir(num, den);
        } catch (NumberFormatException e) {
            throw new FormatoNumeroException("Debe ingresar un numero en el numerador y divisor");
        }
    }
}
