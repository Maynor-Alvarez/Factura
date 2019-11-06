package com.maynoralvarez.modelo;

import java.util.List;


public class FacturaDTO {
	
	private Long idFactura;
	
	
	private String nombre;
	
	private int nit;

	private String fecha;
	
	private List<DetalleFact> detalle;

	public FacturaDTO() {
		super();
	}

	public FacturaDTO(String nombre, int nit, String fecha, List<DetalleFact> detalle) {
		super();
		this.nombre = nombre;
		this.nit = nit;
		this.fecha = fecha;
		this.detalle = detalle;
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

	public List<DetalleFact> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetalleFact> detalle) {
		this.detalle = detalle;
	}
	
	

}
