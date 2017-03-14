package com.esha.utils;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class DbConnection {
	public static Connection getConnection() throws Exception
	   {
	       Class.forName("com.mysql.jdbc.Driver");
	       java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EshaProduct", "root", "password");
	       return (Connection) con;   
	   }
}
