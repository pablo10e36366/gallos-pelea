package com.suda.criadero_gallos_.pelea.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.suda.criadero_gallos_.pelea.dominio.entidades.entrenadores;

public interface EntrenadoresRepositorio {

    // CREATE
    entrenadores guardar(entrenadores entrenador);

    // READ
    Optional<entrenadores> buscarPorId(Long id);
    List<entrenadores> listarTodos();

    // UPDATE
    entrenadores actualizar(entrenadores entrenador);

    // DELETE
    void eliminarPorId(Long id);

}
