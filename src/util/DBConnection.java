package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {

	public static final String url = "jdbc:mysql://localhost:3306/school-db";
	public static final String username = "root";
	public static final String password = "YOUR_PASSWORD";
	
	
	public static Connection getConnection() {
		Connection c = null; 
		try {
			// 1. Load MySQL Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Establish the connection
			c = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return c;
	}
}
