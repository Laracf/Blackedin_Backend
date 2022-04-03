package com.blackedin.backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "curriculos_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curriculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

	private String cep;
    private String escolaridade;
    private String telefone;
    private String experiencia;
    private String competencias;
    private String area_interesse;

	@OneToOne
	@JoinColumn(name = "profissional_id")
	private Profissional profissional;


	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public String getCompetencias() {
		return competencias;
	}
	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	public String getArea_interesse() {
		return area_interesse;
	}
	public void setArea_interesse(String area_interesse) {
		this.area_interesse = area_interesse;
	}

 	public Profissional getProfissional() {
		return profissional;
	}
	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}
}