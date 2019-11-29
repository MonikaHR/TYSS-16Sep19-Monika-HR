package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class UpdateWithTryResourses {
	public static void main(String[] args) {

		try(FileReader reader = new FileReader("db.properties")){
			Properties prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			
			String sql = prop.getProperty("update-querry");
			try(Connection conn = DriverManager.getConnection(url,prop);
					PreparedStatement pstmt = conn.prepareStatement(sql);
					)
{
	
}
			



		}catch(Exception e) {
			e.printStackTrace();
		}


	}
}
