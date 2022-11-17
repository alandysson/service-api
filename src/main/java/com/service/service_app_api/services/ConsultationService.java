package com.service.service_app_api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.service.service_app_api.model.ConsultationModel;
import com.service.service_app_api.model.MachinesModel;
import com.service.service_app_api.model.ParticipantsModel;
import com.service.service_app_api.repository.ConsultationRepository;
import com.service.service_app_api.repository.MachinesRepository;

public class ConsultationService {
	private ConsultationRepository IConsultation;
	@Autowired
	private MachinesRepository IMachines;
	
	
	@Autowired
	public ConsultationService(ConsultationRepository IConsultation) {
		this.IConsultation = IConsultation;
	}
	public ConsultationModel change(int id, ConsultationModel updatedConsultation) {
		System.out.println(updatedConsultation.getNomPaciente());
		ConsultationModel currentConsultation = IConsultation.findById(id).map(prod -> {
			updatedConsultation.setCodConsulta(prod.getCodConsulta());
			return IConsultation.save(updatedConsultation);
			}).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Consulta não encontrada"));
		
		return currentConsultation;
	}
	
	public void createNewConsultation(ParticipantsModel currentContent) {
		Optional<MachinesModel> machinesValue = IMachines.findById(1);
		System.out.println(machinesValue);
		// TODO: try get the machines value and put into the consultationmodel construction
		// or into the new function createnewconsultation
	}
}	
