package com.educontrol.EduControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.educontrol.EduControl.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}
