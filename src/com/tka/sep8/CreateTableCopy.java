package com.tka.sep8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch1271db?useSSL=false";
		String uname = "root";
		String pwd = "root";
		String query = "CREATE TABLE sales1(pid int,product_name varchar(100),category varchar(100),qty int,price int)";
		
		try {
			
			Class.forName(path);
			Connection conn = DriverManager.getConnection(url, uname, pwd);
			Statement st=conn.createStatement();
			st.executeUpdate(query);
			System.out.println("table salescopy created successfully...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			
	}

}
