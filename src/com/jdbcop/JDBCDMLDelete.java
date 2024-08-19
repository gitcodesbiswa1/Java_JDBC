package com.jdbcop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDMLDelete {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1","root","Nte#25");
		Statement st= con.createStatement();
		String s="DELETE from book_detl where book_no= 'BI006'";
		st.execute(s);
		System.out.println("Query executed successfully");
		
	}

}
