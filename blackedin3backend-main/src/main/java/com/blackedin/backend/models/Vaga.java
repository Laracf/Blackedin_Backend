package com.blackedin.backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vagas_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vaga {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo_vaga;
    private String descricao_vaga;
    private String salario;
    private String contrato;

    @ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo_vaga() {
		return titulo_vaga;
	}

	public void setTitulo_vaga(String titulo_vaga) {
		this.titulo_vaga = titulo_vaga;
	}

	public String getDescricao_vaga() {
		return descricao_vaga;
	}

	public void setDescricao_vaga(String descricao_vaga) {
		this.descricao_vaga = descricao_vaga;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}