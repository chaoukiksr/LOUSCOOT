package sccot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/louscoot";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	
	public static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connectionStatus = DriverManager.getConnection(URL,USER,PASSWORD);
			return connectionStatus;
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void createTables() {
		
	}
}
