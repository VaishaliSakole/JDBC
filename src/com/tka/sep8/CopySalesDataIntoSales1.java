package com.tka.sep8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CopySalesDataIntoSales1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch1271db?useSSL=false";
		String uname = "root";
		String pwd = "root";
//		String query = "SELECT * FROM sales";
		List<sales>saleslist=new ArrayList<>();
try {
			
			Class.forName(path);
			Connection conn = DriverManager.getConnection(url, uname, pwd);
			Statement st=conn.createStatement();
			
			ResultSet rs=st.executeQuery("SELECT pid,product name,caterory,qty price from sales...");
			while(rs.next()){
				
			
			
			sales s=new sales(rs.getInt("pid"),rs.getString("product_name"),rs.getString("category"),rs.getInt("qty"),rs.getInt("price"));
			
	saleslist.add(s);
			}

String insertQuery="INSERT INTO sales1 VALUES(?,?,?,?,?)";

try (PreparedStatement pst=conn.prepareStatement(insertQuery)){
	for(sales s:saleslist) {
		pst.setInt(1,s.getPid());
		pst.setString(2,s.getProduct_name());
		pst.setString(3,s.getCategory());
		pst.setInt(4,s.getQty());
		pst.setInt(5,s.getPrice());
		
		pst.addBatch();
		
		
	}
	int[]rows=pst.executeBatch();
	System.out.println(rows.length+"rows copied to salescopy!");
}
}
catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}
}

}
