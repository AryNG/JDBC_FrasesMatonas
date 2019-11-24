package com.frasematonas.mvc;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.sql.Connection;
import org.junit.Test;

//Testing if the connection is successful or not 
public class TestDataBaseConnection {
	@Test
	public void testConnection() {
		Connection connection = DataBaseUtil.getConnection();
		assertNotNull("No se realizó la conexion",connection);
		
		try {
			connection.close();
			assertTrue("Conexion abierta", connection.isClosed());
		}catch (Exception e) {
			
		}
	}
}
