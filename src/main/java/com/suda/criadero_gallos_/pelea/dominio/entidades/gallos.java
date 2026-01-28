package com.suda.criadero_gallos_.pelea.dominio.entidades;

import java.time.LocalDate;

public class gallos {
	
	
	
    public gallos() {
		
	}
	public gallos(Long id, String codigo, String nombre, LocalDate fecha_nacimiento, String color, String raza,
			Integer entrenador_id, Integer estado_id) {

		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.color = color;
		this.raza = raza;
		this.entrenador_id = entrenador_id;
		this.estado_id = estado_id;
	}
	private Long id;
    private String codigo;
    private String nombre;
    private LocalDate fecha_nacimiento;
    private String color;
    private String raza;
    private Integer entrenador_id;
    private Integer estado_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public Integer getEntrenador_id() {
		return entrenador_id;
	}
	public void setEntrenador_id(Integer entrenador_id) {
		this.entrenador_id = entrenador_id;
	}
	public Integer getEstado_id() {
		return estado_id;
	}
	public void setEstado_id(Integer estado_id) {
		this.estado_id = estado_id;
	}
	@Override
	public String toString() {
		return "gallos [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", fecha_nacimiento="
				+ fecha_nacimiento + ", color=" + color + ", raza=" + raza + ", entrenador_id=" + entrenador_id
				+ ", estado_id=" + estado_id + "]";
	}

    
    
    
    
    
    
    
}
