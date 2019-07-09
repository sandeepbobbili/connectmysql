package com.jdbc.connect;

import java.sql.*;
import java.util.HashMap;

public class DBConnection {

	private static Connection con;
	private static String userName = "root";
	private static String password = "Miracle123";
	private static String url = "jdbc:mysql://localhost:3306/cruddatabase";
	private static String driverClass = "com.mysql.jdbc.Driver";
    private static HashMap<String,Connection> hashmap = new HashMap<String,Connection>();
	DBConnection() {
	
	}
	
	public static Connection getConnectionInstance() throws ClassNotFoundException, SQLException {
		 
		 if (hashmap.get("Primary")==null)
		 {
				Class.forName(driverClass);
				con = DriverManager.getConnection(url, userName, password);
				con.setAutoCommit(false);
				hashmap.put("Primary",con);
				return hashmap.get("Primary");
		 }
		 else
		 {
			 return hashmap.get("Primary");
		 }
		
	 }

	

	

}