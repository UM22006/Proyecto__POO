package com.educontrol.EduControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educontrol.EduControl.model.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Integer> {
}