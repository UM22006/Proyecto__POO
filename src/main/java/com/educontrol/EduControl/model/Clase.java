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
    private Boolean estado;

    // Getters y Setters
}
