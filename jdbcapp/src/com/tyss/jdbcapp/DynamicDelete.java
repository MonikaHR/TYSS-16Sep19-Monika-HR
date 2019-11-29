package com.tyss.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class DynamicDelete {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			//1=== load the driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");

			//===get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//step 3 == read the sql querry
			String sql = "delete from Employee_info where id=?";
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

			}catch(SQLException e) {
				e.printStackTrace();
			}



		}
	}
}
