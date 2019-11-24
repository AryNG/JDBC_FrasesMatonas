package com.frasematonasmvc.model;

import java.util.Date;

public class Persona {
//characteristics 
	private int id_persona;
	private String nombre;
	private String carrera;
	private int edad;
	private Date fecha;
	
//constructors 
	public Persona () {}
	public Persona (int id_persona, String nombre, String carrera, int edad, Date fecha) {
		this.id_persona=id_persona;
		this.nombre=nombre;
		this.carrera=carrera;
		this.edad=edad;
		this.fecha=fecha;
	}
//Getters and Setters
	public String getNombre () {
		return nombre;
	}
	
	public String getCarrera() {
		return carrera;
	}
	public int getId_persona() {
		return id_persona;
	}
	public Date getFecha() {
		return fecha;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setCarrera(String carrera) {
		this.carrera=carrera;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	@Override
	public String toString() {
		return String.format(" '%s',%d,'%s' ",nombre, edad, carrera);
	}
}
