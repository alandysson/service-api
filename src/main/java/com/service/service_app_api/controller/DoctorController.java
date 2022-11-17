package com.service.service_app_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.service.service_app_api.model.DoctorModel;
import com.service.service_app_api.repository.DoctorRepository;

@RestController
public class DoctorController {
	@Autowired
	DoctorRepository IDoctor;
	
	@PostMapping("/new_doctor")
	public ResponseEntity<DoctorModel> newDoctor(@RequestBody(required=true) DoctorModel doctor){
		try {
			return new ResponseEntity<DoctorModel>(IDoctor.save(doctor), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
		}
	}
	@GetMapping("/doctor")
	public ResponseEntity<List<DoctorModel>> listDoctor(){
		try {
			return new ResponseEntity<>(IDoctor.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, (HttpStatus.NO_CONTENT));
		}
	}
}
