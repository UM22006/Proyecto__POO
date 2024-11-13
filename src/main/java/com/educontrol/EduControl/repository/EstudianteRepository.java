package com.educontrol.EduControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educontrol.EduControl.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
