package Tareas.Tarea31;

import java.util.stream.IntStream;

public class ArrayOfInteger {
    public static void main(String[] args) {
        IntStream array1 = IntStream.rangeClosed(1, 100);

        Double sum =
                array1.boxed()
                        .filter(ele -> ele % 10 != 0)
                        .mapToDouble(e -> (double) e / 2)
                        .sum();

        System.out.println(sum);
    }
}
