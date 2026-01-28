package com.suda.criadero_gallos_.pelea.dominio.entidades;

import java.time.LocalDateTime;

public class entrenadores {

	
	
    @Override
	public String toString() {
		return "entrenadores [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", activo=" + activo + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Boolean getActivo() {
		return activo;
	}


	public void setActivo(Boolean activo) {
		this.activo = activo;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}


	public entrenadores() {
		
	}
    
    
	public entrenadores(Long id, String nombre, String cedula, String telefono, String direccion, Boolean activo,
			LocalDateTime createdAt, LocalDateTime updatedAt) {

		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		this.activo = activo;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	private Long id;
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;
    private Boolean activo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
