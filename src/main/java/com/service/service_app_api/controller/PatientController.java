package com.service.service_app_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.service_app_api.model.PatientModel;
import com.service.service_app_api.repository.PatientRepository;

@RestController
public class PatientController {
	@Autowired
	private PatientRepository IPatient;
	 
	@GetMapping("/patient")
	public ResponseEntity<List<PatientModel>> listPatient(){
		try {
			return new ResponseEntity<>(IPatient.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, (HttpStatus.NO_CONTENT));
		}
	}
	
	@PostMapping("/new-patient")
	public ResponseEntity<PatientModel> newPatient(@RequestBody(required=false) PatientModel patient) {
		try {
			return new ResponseEntity<>(IPatient.save(patient), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
