package com.suda.criadero_gallos_.pelea.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.suda.criadero_gallos_.pelea.dominio.entidades.vacunacion;

public interface VacunacionRepositorio {

    vacunacion guardar(vacunacion vacunacion);

    Optional<vacunacion> buscarPorId(Long id);

    List<vacunacion> listar();

    void eliminarPorId(Long id);
}