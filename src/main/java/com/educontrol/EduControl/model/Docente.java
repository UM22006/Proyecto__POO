package com.educontrol.EduControl.model;

import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "docente")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_docente;

	@Column
    private String nombres;

	@Column
    private String apellidos;

	@Column
    private Date fecha_nacimiento;

	@Column
    private String nivel_academico;

	@Column
    private String especialidad;

	@Column
    private String dui;

	@Column
    private String telefono;

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
