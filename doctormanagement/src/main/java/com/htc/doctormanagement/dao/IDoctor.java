package com.htc.doctormanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.doctormanagement.entity.Doctor;

public interface IDoctor extends JpaRepository<Doctor,Long> {

}
