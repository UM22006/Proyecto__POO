package com.educontrol.EduControl.model;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "evaluacion")
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_evaluacion;

    @Column
    private Integer id_asignatura;

    @Column
    private Date fecha;

    @Column
    private String tipo;

    @Column
    private Integer numero;

    @Column
    private Boolean estado;

    // Getters y Setters
}
