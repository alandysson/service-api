package com.service.service_app_api.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.service_app_api.model.ConsultationModel;
import com.service.service_app_api.model.ParticipantsModel;
import com.service.service_app_api.repository.ConsultationRepository;
import com.service.service_app_api.services.ConsultationService;

@RestController
@RequestMapping(path="/consultation")
public class ConsultationController {
	@Autowired
	ConsultationRepository IConsultation;
	ConsultationService consultationService;
	
	@GetMapping("/list")
	public ResponseEntity<?> listConsultation(){
		try {
			return new ResponseEntity<>(IConsultation.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	@PostMapping("/test")
	public void message(@RequestBody ParticipantsModel newConsultation) {
		consultationService.createNewConsultation(newConsultation);
	}
	@PostMapping("/new")
	public ResponseEntity<?> newConsultation(@RequestBody ConsultationModel newConsultation){
		try {
			System.out.println(newConsultation.getMachines().getCodMaquinas());
			return new ResponseEntity<>(IConsultation.save(newConsultation), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
		}
	}
	
	 @PutMapping("/update/{id}")
	 public ResponseEntity<?> updateConsultation(@PathVariable int id, @RequestBody ConsultationModel updatedConsultation){
		 try {
			Optional<ConsultationModel> findConsultation = IConsultation.findById(id);
			if(findConsultation.isPresent()) {
				System.out.println(updatedConsultation.getMachines().getTotal());
				System.out.println(updatedConsultation.getDatConsulta());
				ConsultationModel currentConsultation = findConsultation.get();
//				currentConsultation.setDatConsulta(updatedConsultation.getDatConsulta());
				currentConsultation.setDoctor(updatedConsultation.getDoctor());
				currentConsultation.setNomPaciente(updatedConsultation.getNomPaciente());
				currentConsultation.setMachines(updatedConsultation.getMachines());
	 			
				IConsultation.save(currentConsultation);
				return new ResponseEntity<>(HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.NOT_MODIFIED);
		}
		return null;
	 }
}
