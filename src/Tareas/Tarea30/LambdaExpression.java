package Tareas.Tarea30;

import java.util.Collections;

public class LambdaExpression {
    public static void main(String[] args) {

        Counter counter = phrase -> {

            String[] array = phrase.replace(".", "").replace(",", "").toLowerCase().split(" ");

            int max = 0;
            String word = null;
            for (String s : array) {
                int count = 0;
                for (String string : array) {
                    if (s.equalsIgnoreCase(string)) {
                        count++;
                    }
                }

                if (count > max) {
                    max = count;
                    word = s;
                }
            }
            return Collections.singletonMap(word, max);
        };

        String phrase = "Cuando cuentes cuentos, cuenta cuántos cuentos cuentas, porque si no cuentas cuántos cuentos cuentas, nunca sabrás cuántos cuentos cuentas tú.";

        counter.result(phrase)
                .forEach((a, b) -> System.out.println("La palabra '" + a + "' se repite " + b + " veces"));
    }
}
