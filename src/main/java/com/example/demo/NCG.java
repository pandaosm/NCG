package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder

@Table(name = "ncggr_temp")
@Entity
public class NCG {

	
	@Id
	@JsonIgnoreProperties
	private String idNCGGR;

	@JsonDeserialize
	private String ncggr ;

	@JsonDeserialize
	private String ncgcat;

	@JsonDeserialize
	private String ncg ;

	@Transient
	private String libelle;



	public NCG() {
	}

	public String getIdNCGGR() {
		return idNCGGR;
	}

	public void setIdNCGGR(String idNCGGR) {
		this.idNCGGR = idNCGGR;
	}

	public String getNcggr() {
		return ncggr;
	}

	public void setNcggr(String ncggr) {
		this.ncggr = ncggr;
	}

	public String getNcgcat() {
		return ncgcat;
	}

	public void setNcgcat(String ncgcat) {
		this.ncgcat = ncgcat;
	}

	public String getNcg() {
		return ncg;
	}

	public void setNcg(String ncg) {
		this.ncg = ncg;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public NCG(String idNCGGR, String ncggr, String ncgcat, String ncg, String libelle) {
		this.idNCGGR = idNCGGR;
		this.ncggr = ncggr;
		this.ncgcat = ncgcat;
		this.ncg = ncg;
		this.libelle = libelle;
	}
}
