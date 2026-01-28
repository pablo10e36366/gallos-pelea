package com.suda.criadero_gallos_.pelea.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.suda.criadero_gallos_.pelea.dominio.entidades.gallos;

public interface GallosRepositorio {

    gallos guardar(gallos gallo);

    Optional<gallos> buscarPorId(Long id);

    List<gallos> listar();

    void eliminarPorId(Long id);
}
