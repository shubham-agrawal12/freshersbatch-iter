package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMySqlMain1 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","7008876660");
		System.out.println("connection established!!!");
		Statement stmt=con.createStatement();
	//	String s="insert into employee1 values(5,'ddd',88)";
		//String s="delete from employee1 where(id=5)";
	//	String s="update employee1 set name='ddd' "+"WHERE id in(4)";
		PreparedStatement pstmt=con.prepareStatement("insert into employee1 values(?,?,?)");
		pstmt.setInt(1, 101);
		pstmt.setString(2, "anand");
		pstmt.setInt(3, 1000);
		
		pstmt.executeUpdate();
		ResultSet rs=stmt.executeQuery("SELECT *FROM employee1");
		while(rs.next())
		{
			int id=rs.getInt("id");
			String str=rs.getString("name");
			int d=rs.getInt("roll");
			System.out.println(id+"--"+str+"--"+d);
		}
		rs.close();
		pstmt.close();
		con.close();

	}

}
