package com.frasematonas.mvc;
import java.sql.Connection;
import java.sql.DriverManager;
public class DataBaseUtil {
	private static final String URL_FORMAT = "jdbc:%s://%s:%s/%s?useUnicode=true" + "&useJDBCCompliantTimezoneShift=true" + "&useLegacyDatetimeCode=false" + "&serverTimezone=UTC";
/*PROTOCOLO QUE HAY QUE SEGUIR WITCH IS JDBC and the SUBprotocol: mysql. Aqui se estan comunicando el protocolo de jdbc a mysql por medio del localhost, los %s son solo los formatos para que entre los strings siguientes */
	
	//we are creating abstractions 
	public static Connection getConnection() {
		String dbms = "mysql";
		String host = "localhost";
		String port =  "3306";
		String databaseName="frase_matonas";
		String user="root";
		String password="admin";
		String url = String.format(URL_FORMAT, dbms, host, port, databaseName);
		Connection connection = null;
		
		//must have a try-catch to avoid errors
		try {
			//creating an instance (driver) in memory so it can be accessed
			Class.forName("com.mysql.cj.jdbc.Driver"); //This is the direction of the driver which we download from Maven (as .jav) to the folder "lib" inside Web-inf
			connection = DriverManager.getConnection(url, user, password); //gets...well...literal. 
			} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
