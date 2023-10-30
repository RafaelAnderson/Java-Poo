package Tareas.Tarea23;

public class Administracion {
    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero tigre = new Tigre("Sumatra", 5.0f, 15, "Indonesia", 122, 380, 250);
        Mamifero leon = new Leon(120d, 8, 6.5f, 12, "Africa", 120, 330, 250);
        Mamifero guepardo = new Guepardo(3.2f, 60, "Africa", 80, 150, 65);
        Mamifero lobo = new Lobo(8, "Etiope", 2.5f, "Mostaza", "Africa", 65, 120, 50);
        Mamifero perro = new Perro(100, 0.7f, "Mostaza", "México", 25, 33, 6);

        mamiferos[0] = tigre;
        mamiferos[1] = leon;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

        for (Mamifero animal : mamiferos) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println("Altura: " + animal.getAltura());
            System.out.println("Largo: " + animal.getLargo());
            System.out.println("Peso: " + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Colmillos: " + ((Canino) animal).getTamanoColmillos());
                System.out.println("Color: " + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie lobo: " + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número de integrantes: " + ((Lobo) animal).getNumCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida (kg): " + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño de garras: " + ((Felino) animal).getTamanoGarras());
                System.out.println("Velocidad: " + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia de rugido: " + ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número de integrantes: " + ((Leon) animal).getNumManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("Especie tigre: " + ((Tigre) animal).getEspecieTigre());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }
    }
}
