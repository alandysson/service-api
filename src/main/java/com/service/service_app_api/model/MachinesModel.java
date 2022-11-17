package com.service.service_app_api.model;

import javax.persistence.*;


@Entity
@Table(name="tab_maquinas")
public class MachinesModel {
	@Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="cod_maquinas")
	private int codMaquinas;
	@Column(name="val_refracao")
	private int refracao;
	@Column(name="val_tonometria")
	private int tonometria;
	@Column(name="val_total")
	private int total;
	@OneToOne(mappedBy = "machines")
	
	public int getCodMaquinas() {
		return codMaquinas;
	}
	public void setCodMaquinas(int codMaquinas) {
		this.codMaquinas = codMaquinas;
	}
	public int getRefracao() {
		return refracao;
	}
	public void setRefracao(int refracao) {
		this.refracao = refracao;
	}
	public int getTonometria() {
		return tonometria;
	}
	public void setTonometria(int tonometria) {
		this.tonometria = tonometria;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
