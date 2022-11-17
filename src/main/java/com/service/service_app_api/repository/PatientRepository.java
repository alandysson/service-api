package com.service.service_app_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.service_app_api.model.PatientModel;
@Repository
public interface PatientRepository extends JpaRepository<PatientModel, Integer>{

}
