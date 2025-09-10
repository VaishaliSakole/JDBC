package com.tka.sep8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch1271db?useSSL=false";
		String uname = "root";
		String pwd = "root";
		String query = "update sales set qty=qty+? where pid=?";
		
		try {
			// step 1
			Class.forName(path);
			Connection cn=DriverManager.getConnection(url,uname,pwd);
			
			PreparedStatement pst=cn.prepareStatement(query);
			pst.setInt(1,20);
			pst.setInt(2,2);
			
			int ack=pst.executeUpdate();
			if(ack>0) {
				System.out.println("data updated successfully ... with ack="+ack);
			}
			else {
				System.out.println("something went wrong....");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


//step  2
			
			
			
			
	}

}
