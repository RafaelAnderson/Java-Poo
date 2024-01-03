package Hilos.ejemploExecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> tarea = () -> {
            //Runnable tarea = () -> {
            System.out.println("Inicio de la tarea ...");
            try {
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea ...");
            return "Algún resultado importante de la tarea";
        };
        //Future<?> resultado = executor.submit(tarea);
        Future<String> resultado = executor.submit(tarea);
        executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando con la ejecución del método main 1");

        // Future
        //System.out.println(resultado.isDone());
        System.out.println("Continuamos ...");
        while (!resultado.isDone()) {
            System.out.println("ejecutando tarea ...");
            TimeUnit.SECONDS.sleep(1500);
        }
        System.out.println("Obtenemos resultado de la tarea: " + resultado.get(5, TimeUnit.SECONDS));
        System.out.println("Finaliza la tarea: " + resultado.isDone());
    }
}
