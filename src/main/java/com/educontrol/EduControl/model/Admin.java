package com.educontrol.EduControl.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nombres;

	@Column
    private String apellidos;

	@Column
    private Date fecha_nacimiento;

	@Column
    private String nivel_academico;

	@Column
    private String correo;

	@Column
    private String contrasena;

	@Column
    private String token;

	@Column
    private String token_update;

	@Column
    private Integer id_departamento;

	@Column
    private Integer id_municipio;
    
}

// Modifications applied to align with SQL schema.
