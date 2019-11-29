package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DynamicUpdateWithProperties {
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
		String sql = prop.getProperty("update-querry");
		pstmt=conn.prepareStatement(sql);
		
		String empid = args[0];
		int id = Integer.parseInt(empid);
//		pstmt.setInt(1, id);
		
		String name = args[1];
//		pstmt.setString(2, name);
		
		String empsal = args[2];
		int sal = Integer.parseInt(empsal);
//		pstmt.setInt(3, sal);
		
		String gender = args[3];
//		pstmt.setString(4, gender);
		
		pstmt.setInt(4, id);
		pstmt.setString(1, name);
		pstmt.setInt(2, sal);
		pstmt.setString(3, gender);
		
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
