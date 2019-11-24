package com.frasematonasmvc.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.frasematonamvc.db.DatabaseManager;
import com.frasematonas.mvc.DataBaseUtil;
import com.frasematonasmvc.model.Persona;


@WebServlet("/personas")
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Connection conn=null;
		DatabaseManager dbManager = null;
		List<Persona> personas = null;
		RequestDispatcher dispat = null;
		
		conn= DataBaseUtil.getConnection();
		dbManager = new DatabaseManager(conn);
		personas = dbManager.consultarPersona();
		
		//prepare data to send to the MVC
		req.setAttribute("listPersona",personas);
		
		//Indicar la vista a utilizar
		req.getRequestDispatcher("personas.jsp").forward(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Connection conn = null;
		DatabaseManager dbManager = null;
		Persona persona = null;
		
		
		//obtener datos
			//Identificar de donde vas a recuperar los datos
			//Nombre
			String txtNombre = req.getParameter("txtNombre");
			String txtEdad = req.getParameter("txtEdad");
			String txtCarrera = req.getParameter("txtCarrera");
			
			//validation (null, empty, range, date)
			
			//Modelar datos
			persona =  new Persona();
			persona.setNombre(txtNombre);
			persona.setEdad(Integer.parseInt(txtEdad));
			persona.setCarrera(txtCarrera);
			
			/*Save data*/
			//Obtener conexion
			conn = DataBaseUtil.getConnection();
			//manipular los datos
			dbManager  = new DatabaseManager(conn);
			//procesar datos, ejecutar la accion. 
			dbManager.crearPersona(persona);
			
			DataBaseUtil.closeConnection(conn);
			doGet(req,resp);
	}
}
