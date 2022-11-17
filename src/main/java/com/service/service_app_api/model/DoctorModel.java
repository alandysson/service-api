package com.service.service_app_api.model;

import javax.persistence.*;

@Entity
@Table(name="tab_medico")
public class DoctorModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="crm_medico")
	private int crmMedico;
	@Column(name="nom_medico")
	private String nomMedico;
	@OneToOne(mappedBy = "doctor")
	
	public int getCrmMedico() {
		return crmMedico;
	}
	
	public void setCrmMedico(int crmMedico) {
		this.crmMedico = crmMedico;
	}

	public String getNomMedico() {
		return nomMedico;
	}
	public void setNomMedico(String nomMedico) {
		this.nomMedico = nomMedico;
	}
	
	public DoctorModel() {}
	
	public DoctorModel(int crmMedico, String nomMedico) {
		this.crmMedico = crmMedico;
		this.nomMedico = nomMedico;
	}
	
}
