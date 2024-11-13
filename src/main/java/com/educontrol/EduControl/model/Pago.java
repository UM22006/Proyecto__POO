package com.educontrol.EduControl.model;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pago;

    @Column
    private Integer id_estudiante;

    @Column(nullable = false, length = 255)
    private String concepto;

    @Column(nullable = false)
    private Double monto;

    @Column(nullable = false, length = 50)
    private String metodo;

    @Column
    private Date fecha;

    // Getters y Setters
}
