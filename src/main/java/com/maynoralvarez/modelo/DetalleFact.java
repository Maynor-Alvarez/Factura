package com.maynoralvarez.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class DetalleFact{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDetalle;
	
	@NotEmpty
	private int cantidad;
	@NotEmpty
	private String descripcion;
	@NotEmpty
	private int total;
	
	private Long idFactura;

	public DetalleFact() {
		super();
	}

	public DetalleFact(@NotEmpty int cantidad, @NotEmpty String descripcion, @NotEmpty int total) {
		super();
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.total = total;
	}

	public Long getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Long idDetalle) {
		this.idDetalle = idDetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}
	
}
