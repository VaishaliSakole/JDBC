package com.tka.sep8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch1271db?useSSL=false";
		String uname = "root";
		String pwd = "root";
		String query = "insert into sales values(?,?,?,?,?)";

		try {
			// step 1
			Class.forName(path);
			System.out.println("Driver class loaded successfully.....");
			

//step  2
			Connection conn = DriverManager.getConnection(url, uname, pwd);
			
			PreparedStatement pst=conn.prepareStatement(query);
			
			pst.setInt(1, 1);
			pst.setString(2,"chair");
			pst.setString(3,"furnicher");
			pst.setInt(4,100);
			pst.setInt(5, 1000);
			
			
			int ack=pst.executeUpdate();
			if(ack>0) {
			System.out.println("connection establish  successfully....");
	

	}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}

