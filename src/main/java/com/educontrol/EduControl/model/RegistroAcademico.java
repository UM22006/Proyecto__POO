package com.educontrol.EduControl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registro_academico")
public class RegistroAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_registro_academico;

    @Column
    private Integer id_estudiante;

    @Column
    private Integer id_asignatura;

    @Column
    private Double promedio;

    @Column
    private String comentarios;

    // Getters y Setters
}
