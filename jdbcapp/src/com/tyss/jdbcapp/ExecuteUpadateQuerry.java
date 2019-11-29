package com.tyss.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;



public class ExecuteUpadateQuerry {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			//step 1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step 2 get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step 3 issue sql connection
			String sql = "update Employee_Info set name = 'ABC' where id=6";
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);

			//Read the result
			System.out.println(result +" 1 Row(S) affected");




		}
		catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					conn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

	}
}