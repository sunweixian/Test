package com.sun.ConnDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnDB {
	private static Connection conn;
	
	public static Connection getConn() {
		try {
			String url = "jdbc:mysql://localhost:3306/student";
			Class.forName("com.mysql.jdbc.Driver");
			conn =DriverManager.getConnection(url, "root", "us1314");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
