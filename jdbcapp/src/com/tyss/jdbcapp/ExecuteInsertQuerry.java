package com.tyss.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class ExecuteInsertQuerry {
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
			String sql = "insert into Employee_Info values(6,'praveen',50000,'M')";
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
}      //end of ExecuteInsertQuerry
