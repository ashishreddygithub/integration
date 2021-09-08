package com.htc.clinicmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.clinicmanagement.model.ClinicReccomendation;

public interface IHospitalReccomendation extends JpaRepository<ClinicReccomendation, Long> {

	
	
}
