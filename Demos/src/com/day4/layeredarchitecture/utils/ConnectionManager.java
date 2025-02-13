package com.day4.layeredarchitecture.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	private static Connection connection=null;
	private ConnectionManager() {}
	public static Connection getConnection() {
	try {
			connection=
			DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
					"root","root");
		}
		catch(SQLException sq) {
			System.out.println("sql error");
		}
		return connection;
	}

	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
