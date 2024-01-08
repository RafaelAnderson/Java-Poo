package Java8.optional;

import Java8.optional.models.Computador;
import Java8.optional.models.Fabricante;
import Java8.optional.models.Procesador;
import Java8.optional.repositorio.ComputadorRepositorio;
import Java8.optional.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);
    }
}
