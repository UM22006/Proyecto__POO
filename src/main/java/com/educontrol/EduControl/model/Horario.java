package com.educontrol.EduControl.model;

import java.sql.Time;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "horario")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_horario;

    @Column
    private Date fecha;

    @Column
    private Time hora_inicio;

    @Column
    private Time hora_finalizacion;

    // Getters y Setters
}