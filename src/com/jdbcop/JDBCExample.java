package com.jdbcop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
	static final String db_url= "jdbc:mysql://127.0.0.1:3306/db1";
	static final String user = "root";
	static final String PASS= "Nte#25";
	static final String QUERY= "select book_no, title, sub_code, author from book_detl";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection conn= DriverManager.getConnection(db_url,user,PASS);
				Statement stmt= conn.createStatement();
				ResultSet rs= stmt.executeQuery(QUERY);){
			while(rs.next()) {
				System.out.println("Book no. "+ rs.getString("book_no"));
				System.out.println("Title "+ rs.getString("title"));
				System.out.println("Subject code "+ rs.getString("sub_code"));
				System.out.println("Author "+ rs.getString("author")+"\n");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		

	}
}
