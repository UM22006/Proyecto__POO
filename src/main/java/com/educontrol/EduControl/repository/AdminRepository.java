package com.educontrol.EduControl.repository;

// AdminRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

import com.educontrol.EduControl.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
