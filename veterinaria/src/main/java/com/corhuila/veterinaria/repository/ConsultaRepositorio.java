package com.corhuila.veterinaria.repository;

import com.corhuila.veterinaria.EntidadConsulta.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepositorio extends JpaRepository<Consulta, Long> {

}
