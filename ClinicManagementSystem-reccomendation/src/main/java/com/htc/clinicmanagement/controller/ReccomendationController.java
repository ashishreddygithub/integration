package com.htc.clinicmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.clinicmanagement.dao.IHospitalReccomendation;
import com.htc.clinicmanagement.model.ClinicReccomendation;


@RestController
@RequestMapping("/api")
public class ReccomendationController {

	@Autowired
	private IHospitalReccomendation repo;	
	
	
	 @GetMapping("/reccomendations")
	  public List<ClinicReccomendation> getAllPatientdetails() {
	   
	    List<ClinicReccomendation> list = new ArrayList<>();
	    Iterable<ClinicReccomendation> reccomendations = repo.findAll();
	 
	    reccomendations.forEach(list::add);
	    return list;
	  }
	 
	
	@GetMapping("/reccomendations/{hospitalId}")
	ClinicReccomendation getPatientbyId(@PathVariable Long hospitalId)
	{
		ClinicReccomendation reccomendation=null;
		reccomendation=repo.getById(hospitalId);//Due to lazy loading in JPA instead of repo.getOne(id)
		return reccomendation;
		
	}
	
	
	
	@PostMapping("/reccomendations")
	ClinicReccomendation createPatientdetails(@RequestBody ClinicReccomendation reccomendation)
	{
		return repo.save(reccomendation);
		
	}

}
