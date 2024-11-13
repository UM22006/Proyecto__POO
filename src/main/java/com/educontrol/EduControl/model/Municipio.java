package com.educontrol.EduControl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "municipio")
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_municipio;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(name = "id_departamento")
    private Integer id_departamento;

    // Getters y Setters
}
