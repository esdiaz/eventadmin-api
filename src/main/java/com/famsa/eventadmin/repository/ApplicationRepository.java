package com.famsa.eventadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.famsa.eventadmin.model.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
	
}