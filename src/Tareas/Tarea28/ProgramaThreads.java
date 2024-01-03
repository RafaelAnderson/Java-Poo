package Tareas.Tarea28;

public class ProgramaThreads {
    public static void main(String[] args) {

        AlfanumericoTarea tarea1 = new AlfanumericoTarea(Tipo.LETRA);
        AlfanumericoTarea tarea2 = new AlfanumericoTarea(Tipo.NUMERO);

        Thread t1 = new Thread(tarea1);
        Thread t2 = new Thread(tarea2);

        t1.start();
        t2.start();
    }
}
