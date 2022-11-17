package com.service.service_app_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.service_app_api.model.DoctorModel;

public interface DoctorRepository extends JpaRepository<DoctorModel, Integer>{
	
}
