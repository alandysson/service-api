package com.service.service_app_api.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="tab_consulta")
public class ConsultationModel {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_consulta")
	private int codConsulta;
	@Column(name="dat_consulta")
	private Date datConsulta;
	@Column(name="nom_paciente")
	private String nomPaciente;
	@OneToOne
    @JoinColumn(name = "fk_crm_medico", referencedColumnName = "crm_medico")
	private DoctorModel doctor;
	@OneToOne
	@JoinColumn(name = "fk_cod_maquinas", referencedColumnName = "cod_maquinas", nullable = true)
	private MachinesModel machines;
	
	public Date getDatConsulta() {
		return datConsulta;
	}
	public void setDatConsulta(Date datConsulta) {
		this.datConsulta = datConsulta;
	}
	public String getNomPaciente() {
		return nomPaciente;
	}
	public void setNomPaciente(String nomPaciente) {
		this.nomPaciente = nomPaciente;
	}
	public DoctorModel getDoctor() {
		return doctor;
	}
	public void setDoctor(DoctorModel doctor) {
		this.doctor = doctor;
	}
	public MachinesModel getMachines() {
		return machines;
	}
	public void setMachines(MachinesModel machines) {
		this.machines = machines;
	}
	public int getCodConsulta() {
		return codConsulta;
	}
	public void setCodConsulta(int codConsulta) {
		this.codConsulta = codConsulta;
	}
}


