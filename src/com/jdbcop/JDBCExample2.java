package com.jdbcop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "root", "Nte#25");
		Statement st= con.createStatement();
		String s= "Select * from book_detl";
		ResultSet rs= st.executeQuery(s);
		while(rs.next()) {
			String bookno= rs.getString("book_no");
			String title= rs.getString("title");
			String subject= rs.getString("sub_code");
			String author=rs.getString("author");
			String publisher= rs.getString("publisher");
			String status=rs.getString("status");
			String yearofpub=rs.getString("yop");
			String price=rs.getString("price");
			
			System.out.println(bookno+" "+title+" "+subject+" "+author+" "+publisher+" "+status+" "+yearofpub+" "+price+" ");
			
		}
		con.close();
		System.out.println("Queries executed");

	}

}
