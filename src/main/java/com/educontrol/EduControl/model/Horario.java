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
    private String fecha;

    @Column
    private String hora_inicio;

    @Column
    private String hora_finalizacion;

    // Getters y Setters
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHoraInicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public void setHoraFinalizacion(String hora_finalizacion) {
        this.hora_finalizacion = hora_finalizacion;
    }
}