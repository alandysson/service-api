package com.service.service_app_api.model;

import javax.persistence.*;

@Entity
@Table(name="tab_paciente")
public class PatientModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_paciente")
	private int codPaciente;
	@Column(name = "nom_paciente")
	private String nomPaciente;
	
	public String getNomPaciente() { 
		return nomPaciente;
	}
	public void setNomPaciente(String nomPaciente) {
		this.nomPaciente = nomPaciente;
	}
	public int getCodPaciente() {
		return codPaciente;
	}

}
