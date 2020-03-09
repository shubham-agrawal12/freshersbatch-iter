package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class JdbcMySqlMain {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","7008876660");
		System.out.println("connection established!!!!!1");
		Statement stmt=dbcon.createStatement();
		//String s="update employee set Name='arko' " + "where id in(3)";
	//	String s="INSERT INTO employee1 VALUES (5,'ccc',100)";
		String s="DELETE FROM employee1 WHERE (id=5)";
		//PreparedStatement pstmt=dbcon.prepareStatement("INSERT INTO employee VALUES(?,?,?)");
		//PreparedStatement pstmt=dbcon.prepareStatement("DELETE FROM employee WHERE id=?");
		//PreparedStatement pstmt=dbcon.prepareStatement("update employee set name=? WHERE id=?");
		//pstmt.setString(2, "jhgh");
		//pstmt.setInt(1,2);
		
		//pstmt.setString(2, "adasd");
		//pstmt.setDouble(3, 55.0);
		//int updates=
		stmt.executeUpdate(s);
		//System.out.println(updates);
		ResultSet rs=stmt.executeQuery("SELECT * FROM employee1");
		while(rs.next())
		{
			int id=rs.getInt("ID");
			String name=rs.getString("name");
			double phone=rs.getDouble("roll");
			System.out.println(id+"--"+name+"--"+phone)
;
			}
		
		//pstmt.close();
		rs.close();
		stmt.close();
		dbcon.close();
	}

}
