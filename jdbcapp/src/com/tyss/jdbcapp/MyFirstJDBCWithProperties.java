package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


public class MyFirstJDBCWithProperties {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);


			//Step 1 ----> Load the Driver.
			//		Driver driver = new Driver();
			//		DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));

			//Step 2 ----> Get the Connection.
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);

			//Step 3 -----> Issue SQL query.
			String sql = prop.getProperty("select-querry");
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
		}catch(Exception e){
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
				if(reader != null) {
					reader.close();
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}
}
