package com.frasematonas.mvc;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.frasematonamvc.db.DatabaseManager;
import com.frasematonas.mvc.DataBaseUtil;
import com.frasematonasmvc.model.Persona;

public class TestReadPersona {
	@Test
	public void testReadPersona() {
		Connection connection = DataBaseUtil.getConnection();
		DatabaseManager dbManager =  new DatabaseManager(connection);
		List<Persona> list=  dbManager.consultarPersona();
		assertNotNull("No se consultó",list);
		assertTrue("no hay datos",list.size()>0);
		DataBaseUtil.closeConnection(connection);
		
		try {
			assertTrue("no se cerro la conexion", connection.isClosed());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
