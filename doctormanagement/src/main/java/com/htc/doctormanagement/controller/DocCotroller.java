package com.htc.doctormanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.doctormanagement.dao.IDoctor;
import com.htc.doctormanagement.entity.Doctor;

@RestController
@RequestMapping("/api")

public class DocCotroller {
	
		
		@Autowired
		private IDoctor repo;

		
		 @GetMapping("/doctors")
		  public List<Doctor> getAllDoctordetails() {
		   
		    List<Doctor> list = new ArrayList<>();
		    Iterable<Doctor> customers = repo.findAll();
		 
		    customers.forEach(list::add);
		    return list;
		  }
		 
		
		@GetMapping("/doctors/{doctorId}")
		Doctor getDoctorbyId(@PathVariable Long doctorId)
		{
			Doctor doctor=null;
			doctor=repo.findById(doctorId).get();
			return doctor;
			
		}
		
		@GetMapping("/doctors/{appointmentId}")
		Doctor getByappointmentId(@PathVariable Long appointmentId)
		{
			Doctor doctor=null;
			doctor=repo.findById(appointmentId).get();
			return doctor;
			
		}
		
		
		
		
		
		@PostMapping("/doctors")
		Doctor createDoctordetails(@RequestBody Doctor doctor)
		{
			return repo.save(doctor);
			
		}

	}


