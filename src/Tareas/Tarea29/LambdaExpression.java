package Tareas.Tarea29;

public class LambdaExpression {
    public static void main(String[] args) {

        IFuncional lambda = phrase ->
                phrase
                        .replace(".", "")
                        .replace(",", "")
                        .replace(" ", "")
                        .toUpperCase();

        String newPhrase = lambda.managePhrase("Cuando cuentes cuentos, cuenta cuántos cuentos cuentas, porque si no cuentas cuántos cuentos cuentas, nunca sabrás cuántos cuentos cuentas tú.");
        System.out.println(newPhrase);
    }
}
