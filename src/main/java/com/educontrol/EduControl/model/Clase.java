package com.educontrol.EduControl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clase")
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_clase;

    @Column
    private Integer id_asignatura;

    @Column
    private Integer id_docente;

    @Column
    private Integer id_horario;

    @Column
    private Integer estado;

    // Getters y Setters
    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public void setIdAsignatura(Integer id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public void setIdDocente(Integer id_docente) {
        this.id_docente = id_docente;
    }

    public void setIdHorario(Integer id_horario) {
        this.id_horario = id_horario;
    }
}
