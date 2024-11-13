package com.educontrol.EduControl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "docente_asignatura")
public class DocenteAsignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_docente")
    private Integer idDocente;

    @Column(name = "id_asignatura")
    private Integer idAsignatura;

    // Getters y Setters
}
