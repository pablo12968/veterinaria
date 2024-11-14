package com.corhuila.veterinaria.EntidadConsulta;

import jakarta.persistence.*;

import java.util.Date;

@Entity //para que indique al jpa para usar una api clase tipo entidad
@Table(name="Consultas")


public class Consulta {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long Id;
  @Column(nullable = false)

  private String Mascota;
  @Column(nullable = false)

  private Date FechaCo ;
  @Column(nullable = false)

  private String Diagnostico;

  @Column(nullable = false)
  private String Tratamiento;

  private String Veterinario;
  @Column(nullable = false)

  private String DueñoM;

  public long getId() {
    return Id;
  }

  public void setId(long id) {
    Id = id;
  }

  public String getMascota() {
    return Mascota;
  }

  public void setMascota(String mascota) {
    Mascota = mascota;
  }

  public Date getFechaCo() {
    return FechaCo;
  }

  public void setFechaCo(Date fechaCo) {
    FechaCo = fechaCo;
  }

  public String getDiagnostico() {
    return Diagnostico;
  }

  public void setDiagnostico(String diagnostico) {
    Diagnostico = diagnostico;
  }

  public String getTratamiento() {
    return Tratamiento;
  }

  public void setTratamiento(String tratamiento) {
    Tratamiento = tratamiento;
  }

  public String getVeterinario() {
    return Veterinario;
  }

  public void setVeterinario(String veterinario) {
    Veterinario = veterinario;
  }

  public String getDueñoM() {
    return DueñoM;
  }

  public void setDueñoM(String dueñoM) {
    DueñoM = dueñoM;
  }
}
