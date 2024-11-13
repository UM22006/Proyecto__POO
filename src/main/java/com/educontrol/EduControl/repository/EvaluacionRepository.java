package com.educontrol.EduControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.educontrol.EduControl.model.Evaluacion;

public interface EvaluacionRepository extends JpaRepository<Evaluacion, Integer> {
}
