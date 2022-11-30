package com.student;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class INSERT_JDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//1.registering
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","rohit@2002");
			//3. create statement
			Statement stmt= con.createStatement();
			
			//updating an existing record
			stmt.executeUpdate("insert into studenttable values(1,'rohit',9884567,'Kolkata')");
		    stmt.executeUpdate("insert into studenttable values(2,'pritam',6295985,'Dumdum')");
		    stmt.executeUpdate("insert into studenttable values(3,'chanchal',7585979,'naihati')");
		    stmt.executeUpdate("insert into studenttable values(4,'Sankalpa',9083435,'hawrah')");
		System.out.println("inserted successfully.");
		//5.closing connection
		    con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}



