package com.rk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	
}
