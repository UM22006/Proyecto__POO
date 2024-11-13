package com.educontrol.EduControl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "asignatura")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_asignatura;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column
    private Integer id_docente;

    @Column
    private Integer id_horario;

    // Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdDocente(Integer id_docente) {
        this.id_docente = id_docente;
    }

    public void setIdHorario(Integer id_horario) {
        this.id_horario = id_horario;
    }
}
