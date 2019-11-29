package com.tyss.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class DynamicUpdate {
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try {
		//1=== load the driver
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		Class.forName("com.mysql.jdbc.Driver");
		
		//===get the connection
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		conn = DriverManager.getConnection(url);
		
		//step 3 == read the sql querry
		String sql = "update Employee_Info set name=?,sal=?,gender=? where id=?";
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
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
}
