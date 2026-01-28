package com.suda.criadero_gallos_.pelea.dominio.entidades;

import java.time.LocalDate;

public final class alimentacion {

	
	
    public alimentacion(Long id, Integer gallo_id, String tipo_alimento, String cantidad, LocalDate fecha,
			String observaciones) {
	
		this.id = id;
		this.gallo_id = gallo_id;
		this.tipo_alimento = tipo_alimento;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.observaciones = observaciones;
	}
	public alimentacion() {
		
	}
	private Long id;
    private Integer gallo_id;
    private String tipo_alimento;
    private String cantidad;
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
	public String getTipo_alimento() {
		return tipo_alimento;
	}
	public void setTipo_alimento(String tipo_alimento) {
		this.tipo_alimento = tipo_alimento;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
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
		return "alimentacion [id=" + id + ", gallo_id=" + gallo_id + ", tipo_alimento=" + tipo_alimento + ", cantidad="
				+ cantidad + ", fecha=" + fecha + ", observaciones=" + observaciones + "]";
	}
    
    
    

}
