package com.frasematonamvc.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import com.frasematonasmvc.model.Frases;
import com.frasematonasmvc.model.Persona;

public class DatabaseManager {
	private Connection conn;
	
//-----------------------------------------------------------------------------	
	//Attribute
	public DatabaseManager() {}
	
	public DatabaseManager(Connection conn) {
		this.conn=conn;
	}

	//QUERYS =  Todo esta parte hará el query desde java como si tu lo hicieras en la consola. 
	public void crearPersona(Persona persona) {
		String query = "insert into persona (nombre, carrera, edad)" + "values(" + persona.toString() + ")";
		
		
		//"try" = you need it 'cause it might generates an Exception
		Statement stat = null;
		try { 
			stat = conn.createStatement();
			stat.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
	}
//-----------------------------------------------------------------------------
	public void crearFrase(Frases frase) {
		String query =  "insert into frases (contenido, cantidad, fechaDesde)" + "values(?,?,?)";
		PreparedStatement stat=null;
		
		try {
			stat=conn.prepareStatement(query);
			stat.setString(1, frase.getContenido());
			stat.setInt(2, frase.getCantidad());
			stat.setDate(3,(java.sql.Date) frase.getFechaDesde());
			
			stat.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//-----------------------------------------------------------------------
	public void crearFrasePersona(int idPersona, int idFrase) {
		String query="insert into Frase_Persona("+idPersona+","+idFrase+")";
		//executeStatement(query);
		//"try" = you need it 'cause it might generates an Exception
				Statement stat = null;
				try { 
					stat = conn.createStatement();
					stat.executeUpdate(query);
				} catch (SQLException e) {
					e.printStackTrace();
				
				}
	} 
//-----------------------------------------------------------------------------
	public List<Persona> consultarPersona(){
		String query = "select * from persona";
		Statement stat= null;
		ResultSet rs = null;
		List<Persona> listPersonas = null;
		
		try {
			stat =  conn.createStatement();
			rs = stat.executeQuery(query);
			
			//creating model
			listPersonas = new ArrayList<>();
			while(rs.next()) { 
				//adding values to the model
				Persona persona = new Persona();
				persona.setId_persona(rs.getInt("id_persona"));
				persona.setNombre(rs.getString("nombre"));
				persona.setCarrera(rs.getString("carrera"));
				persona.setEdad(rs.getInt("edad"));
				persona.setFecha(rs.getDate("fecha"));
				
				listPersonas.add(persona); //adding the model to the list
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listPersonas;
	}
//-----------------------------------------------------------------------------
	public List<Frases> consultarFrases(){
		String query = "select * from Frases";
		Statement stat=null;
		ResultSet rs = null;
		List<Frases> listFrases = null;
		try {
			stat= conn.createStatement();
			rs=stat.executeQuery(query);
			
			listFrases = new ArrayList<>();
			while(rs.next()) {
				Frases frases = new Frases();
				frases.setId_frase(rs.getInt("id_frase"));
				frases.setContenido(rs.getString("contenido"));
				frases.setCantidad(rs.getInt("cantidad"));
				frases.setFecha(rs.getDate("fecha"));
				
				listFrases.add(frases);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return listFrases;
	}
//-----------------------------------------------------------------------------
	public List<Frases> consultarFrasesPersona(int idPersona){
		String query = "Select * from Persona_Frase where idPersona="+idPersona;
		Statement stat=null;
		ResultSet rs= null;
		List<Frases> listFrasesPersona = null;
		
		
		try {
			stat = conn.createStatement();
			rs = stat.executeQuery(query);
			listFrasesPersona=new ArrayList<>();
			while(rs.next()) {
				Frases frase = new Frases();
				
				frase.setId_frase(rs.getInt("id_Frase"));
				frase.setContenido(rs.getNString("contenido"));
				frase.setCantidad(rs.getInt("cantidad"));
				frase.setFechaDesde(rs.getDate("fechaDesde"));
				frase.setFecha(rs.getDate("fecha"));
				
				listFrasesPersona.add(frase);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
