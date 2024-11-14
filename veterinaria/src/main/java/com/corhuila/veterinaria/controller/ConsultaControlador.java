package com.corhuila.veterinaria.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.corhuila.veterinaria.EntidadConsulta.Consulta;
import com.corhuila.veterinaria.service.ConsultaServicio;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
public class ConsultaControlador {

  @Autowired
  private ConsultaServicio consultaServicio;

  @GetMapping("/Consultas")
  public List<Consulta> index() {
    return consultaServicio.findAll(); // Usando la instancia inyectada
  }

  @GetMapping("/{id}")
  public Consulta getConsultaById(@PathVariable Long id) {
    return consultaServicio.getConsultaById(id);
  }

  @PostMapping
  public Consulta saveConsulta(@RequestBody Consulta consulta) {
    return consultaServicio.saveConsulta(consulta);
  }

  @DeleteMapping("/{id}")
  public void deleteConsulta(@PathVariable Long id) {
    consultaServicio.deleteConsulta(id);
  }
}
