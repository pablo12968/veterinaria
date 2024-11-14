package com.corhuila.veterinaria.service;

import com.corhuila.veterinaria.EntidadConsulta.Consulta;

import java.util.List;

public interface IConsultaServicio {
  List<Consulta> findAll();
}
