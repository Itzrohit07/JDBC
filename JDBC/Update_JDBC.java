package com.student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Update_JDBC {

	public static void main(String[] args) {
	try {	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","rohit@2002");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("update studenttable set sadd='Harwah' where sid=4");
		stmt.executeUpdate("delete from studenttable where sid=2");
		ResultSet cr=stmt.executeQuery("select *from studenttable");
		while(cr.next()) {
			System.out.println(cr.getInt(1)+" "+cr.getString(2)+" "+cr.getInt(3)+" "+cr.getString(4));
		}
		con.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}

