package com.htc.paitentmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.paitentmanagement.dao.IPaitent;
import com.htc.paitentmanagement.entity.Paitent;

@RestController
@RequestMapping("/api")
public class PaitentController {
	@Autowired
	private IPaitent repo;

	
	 @GetMapping("/patients")
	  public List<Paitent> getAllPatientdetails() {
	   
	    List<Paitent> list = new ArrayList<>();
	    Iterable<Paitent> customers = repo.findAll();
	 
	    customers.forEach(list::add);
	    return list;
	  }
	 
	
	@GetMapping("/patients/{patientId}")
	Paitent getPatientbyId(@PathVariable Long patientId)
	{
		Paitent patient=null;
		patient=repo.getById(patientId);//Due to lazy loading in JPA instead of repo.getOne(id)
		return patient;
		
	}
	
	@GetMapping("/patients/{appointmentId}")
	Paitent getPatientbyAppointmentId(@PathVariable Long appointmentId)
	{
		Paitent patient=null;
		patient=repo.getById(appointmentId);//Due to lazy loading in JPA instead of repo.getOne(id)
		return patient;
		
	}
	
	
	@PostMapping("/patients")
	Paitent createPatientdetails(@RequestBody Paitent patient)
	{
		return repo.save(patient);
		
	}
	

	
}