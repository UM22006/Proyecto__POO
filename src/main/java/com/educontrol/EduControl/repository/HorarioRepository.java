package com.educontrol.EduControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educontrol.EduControl.model.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Integer> {
}
