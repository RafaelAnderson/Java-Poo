package Excepciones.repositorio.repositorio;

import Excepciones.repositorio.repositorio.excepciones.AccesoDatoException;
import Excepciones.repositorio.repositorio.excepciones.EscrituraAccesoDatoException;
import Excepciones.repositorio.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();

    T porId(Integer id) throws AccesoDatoException;

    void crear(T t) throws AccesoDatoException;

    void editar(T t) throws AccesoDatoException;

    void eliminar(Integer id) throws AccesoDatoException;
}
