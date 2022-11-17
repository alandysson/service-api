package com.service.service_app_api.model;

public class ParticipantsModel {
	private String nomPaciente;
	private DoctorModel medico;
	public String getNomPaciente() {
		return nomPaciente;
	}
	public void setNomPaciente(String nomPaciente) {
		this.nomPaciente = nomPaciente;
	}
	public DoctorModel getMedico() {
		return medico;
	}
	public void setMedico(DoctorModel medico) {
		this.medico = medico;
	}
}
