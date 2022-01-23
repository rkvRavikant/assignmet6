package com.greatlearning.dp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	static String dbUrl = "jdbc:mysql://localhost:3306/database"; 
	static String userName = "user"; 
	static String password = "pasword";
	private static Connection instance;
	
	private JdbcConnection() {}
	
	
	public synchronized static Connection getConnection() throws SQLException
    {
                if (instance == null)
						instance = DriverManager.getConnection(dbUrl, userName, password);
				return instance;
					
    }
}
