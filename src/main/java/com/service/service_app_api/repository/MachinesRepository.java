package com.service.service_app_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.service_app_api.model.MachinesModel;

public interface MachinesRepository extends JpaRepository<MachinesModel, Integer>{

}
