package com.tyss.jdbcmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DeleteQuerry {
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
			String sql = "delete from Employee_Info where id=28";
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
