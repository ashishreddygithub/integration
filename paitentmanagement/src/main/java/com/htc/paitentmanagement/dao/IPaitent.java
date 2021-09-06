package com.htc.paitentmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.paitentmanagement.entity.Paitent;

public interface IPaitent extends JpaRepository<Paitent, Long> {

}
