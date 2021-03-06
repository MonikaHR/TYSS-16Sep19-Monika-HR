package com.tyss.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class ExecuteDeleteQuerry {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			//step 1 ---> load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//Step 2 ----> get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//Step 3 ----> issue sql statement
			String sql = "delete from Employee_Info where id=5";
			stmt = conn.createStatement();
			int res = stmt.executeUpdate(sql);

			//step 4 -----> read the result
			System.out.println(res + " 1 Row(s) affected");



		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}


			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
