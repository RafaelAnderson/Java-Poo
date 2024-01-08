package Java8.optional.repositorio;

import Java8.optional.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);
}
