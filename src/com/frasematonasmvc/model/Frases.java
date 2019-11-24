package com.frasematonasmvc.model;

import java.util.Date;

public class Frases {
//Characteristics
	private int id_frase;
	private String contenido;
	private int cantidad;
	private java.sql.Date fechaDesde;
	private Date fecha;
	
//Constructors
	public Frases() {}
	public Frases(int id_frase,String contenido, int cantidad,java.sql.Date sinceDate ,Date fecha) {
		this.id_frase=id_frase;
		this.contenido=contenido;
		this.cantidad=cantidad;
		this.fechaDesde=fechaDesde;
		this.fecha=fecha;
	}
	
//Getters and setters
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public int getId_frase() {
		return id_frase;
	}
	public void setId_frase(int id_frase) {
		this.id_frase = id_frase;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad =cantidad;
	}
	public java.sql.Date getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(java.sql.Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	@Override
	public String toString() {
		return String.format("'%s',%d,'%s'", contenido, cantidad, fechaDesde);
	}
}
