package com.AppRH.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity 
public class Candidato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)
	@NotEmpty
	private String cpf;
	@NotEmpty @NotNull
	private String nomeCandidato;
	@NotEmpty @NotNull
	private String email;
	
	@ManyToMany
	@JoinTable(name = "CANDIDATO_VAGA",
		joinColumns = @JoinColumn(name = "candidato_id"),
		inverseJoinColumns = @JoinColumn(name = "vaga_id"))
	private List<Vaga> vagas;


	public Candidato() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNomeCandidato() {
		return nomeCandidato;
	}


	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Vaga> getVagas() {
		return vagas;
	}


	public void setVagas(List<Vaga> vagas) {
		this.vagas = vagas;
	}
	
	
}
