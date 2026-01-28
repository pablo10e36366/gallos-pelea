package com.suda.criadero_gallos_.pelea.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.suda.criadero_gallos_.pelea.dominio.entidades.alimentacion;

public interface AlimentacionRepositorio {

    alimentacion guardar(alimentacion alimentacion);

    Optional<alimentacion> buscarPorId(Long id);

    List<alimentacion> listar();

    void eliminarPorId(Long id);
}
