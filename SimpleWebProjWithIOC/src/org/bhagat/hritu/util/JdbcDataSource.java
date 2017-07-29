package org.bhagat.hritu.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDataSource {

	private static Connection connection;
	public static Connection getConnection(){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_ors","root","root");
		}catch(Exception ee){
			System.out.println("Exception occurred while creating connection object");
		}
		return connection;
	}
}
