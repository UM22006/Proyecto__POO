package com.educontrol.EduControl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "historico_evaluacion")
public class HistoricoEvaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_historico_evaluacion;

    @Column
    private Integer id_estudiante;

    @Column
    private Integer id_evaluacion;

    @Column
    private Double calificacion;

    @Column
    private String comentarios;

    // Getters y Setters
}
