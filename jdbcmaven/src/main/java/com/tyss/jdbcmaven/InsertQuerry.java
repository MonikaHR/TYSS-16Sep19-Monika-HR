package com.tyss.jdbcmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertQuerry {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;

		try {
			//step 1 Load the driver
			Driver driver = new Driver();                 //we can throw exception in consturctor.
			DriverManager.registerDriver(driver);

			//Step 2 Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//Step 3 Issue Sql Querry
			String sql = "insert into Employee_Info values(28,'Rajesh',10000,'M')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);

			//Step 4 Read the result
			System.out.println(count + " Row(s) Inserted ");


		}catch(SQLException e){
			e.printStackTrace();


		}
		finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					conn.close();
				}

			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}  //end of main

}
