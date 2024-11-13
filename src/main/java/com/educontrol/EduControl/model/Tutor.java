package com.educontrol.EduControl.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tutor")
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tutor;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(nullable = false, length = 100)
    private String apellidos;

    @Column(nullable = false, length = 10)
    private String telefono;

    @Column(nullable = false, length = 50)
    private String parentesco;

    @Column
    private Date fecha_nacimiento;

    @Column
    private Integer id_departamento;

    @Column
    private Integer id_municipio;

    // Getters y Setters
}
