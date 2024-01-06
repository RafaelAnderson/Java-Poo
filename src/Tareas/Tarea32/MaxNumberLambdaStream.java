package Tareas.Tarea32;

import java.util.Arrays;
import java.util.function.Function;

public class MaxNumberLambdaStream {
    public static void main(String[] args) {

        Integer[] arrayNumber = new Integer[]{1, -2, 3, -4, 5, 6, 10, -11};
        Function<Integer[], Integer> max = arr -> Arrays.stream(arr).reduce(0, (x, y) -> (x > y) ? x : y);

        int maxNumber = max.apply(arrayNumber);
        System.out.println("El número mayor es: " + maxNumber);
    }
}
