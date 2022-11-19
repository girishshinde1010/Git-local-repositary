package com.regester.login;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	public static Connection getConnection() {
		
		Connection connection = null;
		try {
			//load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root",
					"girish1010");		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		finally{
			return connection;
		}
	}
}
