package com.tyss.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class DynamicSelect {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from Employee_Info where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			//step 1
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step2  
			conn = DriverManager.getConnection(url);

			//step 3
			pstmt = conn.prepareStatement(sql);

			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();

			//step 4
			if(rs.next()) {
				int id1 = rs.getInt("id");
				String name1 = rs.getString("name");
				int salary = rs.getInt("sal");
				String gen = rs.getString("gender");

				System.out.println("Id is: "+id1);
				System.out.println("Name is: "+name1);
				System.out.println("salary is: "+salary);
				System.out.println("gender is: "+gen);

			}


		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//step 5
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(rs != null) {
					rs.close();
				}

			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
