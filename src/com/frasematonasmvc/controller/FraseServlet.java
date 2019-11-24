package com.frasematonasmvc.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FraseServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String txtContenido = req.getParameter("txtContenido");
			String txtCantidad = req.getParameter("txtCantidad");
			String txtFecha = req.getParameter("txtFecha");
			
			Connection connection = null;
	}
}
