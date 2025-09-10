package com.tka.sep8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
public class SelectOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch1271db?useSSL=false";
		String uname = "root";
		String pwd = "root";
		String query = "SELECT * FROM sales";

		try {
			// step 1
			Class.forName(path);
			System.out.println("Driver class loaded successfully.....");

//step  2
			Connection conn = DriverManager.getConnection(url, uname, pwd);
			System.out.println("connection establish  successfully....");

//step 3
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			System.out.println("Result set generated successfully....");

			int count = 0;
			List<sales> db = new ArrayList<>();
			while (rs.next()) {
				count++;


				int pid = rs.getInt(1);
				String product_name = rs.getString(2);
				String category = rs.getString(3);
				int qty = rs.getInt(4);
				int price = rs.getInt(5);

				sales obj = new sales(pid, product_name, category, qty, price);
				db.add(obj);

			}
			for (sales s : db) {
				System.out.println(s);
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
