package Tareas.Tarea35;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ClassBornDate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String bornDate;
        System.out.print("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
        bornDate = scanner.next();

        try {
            LocalDate getBornDate = LocalDate.parse(bornDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate dateNow = LocalDate.now();
            Period period = Period.between(getBornDate, dateNow);

            System.out.println("Fecha de nacimiento: " + bornDate);
            System.out.printf("Tu edad actual es: " + period.getYears() + " año(s)");
        } catch (DateTimeParseException e) {
            System.out.println("Error, la fecha no tiene el formato solicitado: dd/MM/yyyy.");
        }
    }
}
