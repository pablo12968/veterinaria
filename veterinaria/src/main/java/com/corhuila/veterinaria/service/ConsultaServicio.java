package com.corhuila.veterinaria.service;

import com.corhuila.veterinaria.EntidadConsulta.Consulta;
import com.corhuila.veterinaria.repository.ConsultaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaServicio implements IConsultaServicio {

  @Autowired
  private ConsultaRepositorio consultaRepositorio; // Ya no es static

  @Override
  public List<Consulta> findAll() {
    return (List<Consulta>) consultaRepositorio.findAll();
  }

  public Consulta saveConsulta(Consulta consulta) {
    return consultaRepositorio.save(consulta);
  }

  public Consulta getConsultaById(Long id) {
    return consultaRepositorio.findById(id).orElse(null);
  }

  public void deleteConsulta(Long id) {
    consultaRepositorio.deleteById(id);
  }
}
