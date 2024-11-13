package com.educontrol.EduControl.model;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_estudiante;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(nullable = false, length = 100)
    private String apellidos;

    @Column
    private Date fecha_nacimiento;

    @Column(nullable = false, length = 50)
    private String nivel_academico;

    @Column
    private Integer id_departamento;

    @Column
    private Integer id_municipio;

    @Column
    private Integer id_tutor;

    // Getters y Setters
}
