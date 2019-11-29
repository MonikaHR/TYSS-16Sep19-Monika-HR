package com.tyss.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//Step 1 ----> Load the Driver.
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//Step 2 ----> Get the Connection.
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//Step 3 -----> Issue SQL query.
			String sql = "select * from Employee_Info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			//Step 4 ----->Read the result

			while(rs.next()) {
				int id = rs.getInt("id");              //should specify proper column name.
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");

				System.out.println("Id: "+id);
				System.out.println("Name: "+name);
				System.out.println("sal: "+sal);
				System.out.println("gender: "+gender);
				System.out.println("*********************");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			//Step 5 Close All JDBC Objects
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(rs != null) {
					rs.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		


	}    //end of main
}       //end of MyFirstJDBC


