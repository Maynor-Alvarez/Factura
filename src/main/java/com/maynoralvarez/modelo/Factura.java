package com.maynoralvarez.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idFactura;
	
	@NotEmpty
	private String nombre;
	@NotEmpty
	private int nit;
	@NotEmpty
	private String fecha;
	
	public Factura() {
		super();
	}

	public Factura(@NotEmpty String nombre, @NotEmpty int nit, @NotEmpty String fecha) {
		super();
		this.nombre = nombre;
		this.nit = nit;
		this.fecha = fecha;
	}

	public Long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
	
}
