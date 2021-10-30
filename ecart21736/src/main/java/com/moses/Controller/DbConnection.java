package com.moses.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getConnected() throws SQLException{
		String url="jdbc:mysql://localhost:3306/demo";
		String username="root";
		String password="root";
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection con=DriverManager.getConnection(url,username,password);
	    return con;
	
}
	
}
