package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DynamicDeleteWithProperties {
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	FileReader reader = null;

	try {
		reader = new FileReader("db.properties");
		Properties prop = new Properties();
		prop.load(reader);
		
		
		//1=== load the driver
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		Class.forName(prop.getProperty("driver-class-name"));

		//===get the connection
		String url = prop.getProperty("url");
		conn = DriverManager.getConnection(url,prop);

		//step 3 == read the sql querry
		String sql = prop.getProperty("delete-querry");
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(args[0]));

		//		String empid = args[0];
		//		int id = Integer.parseInt(empid);            //Instead of using 3 lines we can write in single line
		//		pstmt.setInt(1, id);



		int count = pstmt.executeUpdate();

		//4== read the result
		System.out.println(count +"Row(s) affected");


	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		//5== close all jdbc objects
		try {
			if(conn != null) {
				conn.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(reader != null) {
				reader.close();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}



	}
}
}
