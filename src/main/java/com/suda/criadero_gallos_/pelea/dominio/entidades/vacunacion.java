package com.suda.criadero_gallos_.pelea.dominio.entidades;

import java.time.LocalDate;

public final class vacunacion {

	public vacunacion(Long id, Integer gallo_id, String vacuna, String dosis, LocalDate fecha, String observaciones) {
		
		this.id = id;
		this.gallo_id = gallo_id;
		this.vacuna = vacuna;
		this.dosis = dosis;
		this.fecha = fecha;
		this.observaciones = observaciones;
	}
	public vacunacion() {
	
	}
	private Long id;
	private Integer gallo_id;
	private String vacuna;
	private String dosis;
	private LocalDate fecha;
	private String observaciones;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getGallo_id() {
		return gallo_id;
	}
	public void setGallo_id(Integer gallo_id) {
		this.gallo_id = gallo_id;
	}
	public String getVacuna() {
		return vacuna;
	}
	public void setVacuna(String vacuna) {
		this.vacuna = vacuna;
	}
	public String getDosis() {
		return dosis;
	}
	public void setDosis(String dosis) {
		this.dosis = dosis;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	@Override
	public String toString() {
		return "vacunacion [id=" + id + ", gallo_id=" + gallo_id + ", vacuna=" + vacuna + ", dosis=" + dosis
				+ ", fecha=" + fecha + ", observaciones=" + observaciones + "]";
	}

}