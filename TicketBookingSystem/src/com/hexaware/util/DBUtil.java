package com.hexaware.util;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {
public static void main(String[]args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticket_booking_system","root","20danger");
		PreparedStatement ps=con.prepareStatement("Select *from customer where customerid between 201 and 210");
		System.out.println("Showing records");
		
		ResultSet rs =ps.executeQuery();
		while(rs.next()) {
			int customerid1=rs.getInt("customerid");
			String name1=rs.getString("customername");
			System.out.println(customerid1+" "+name1);
	} con.close();
		 
	}catch(Exception e) {   
		System.out.println(e); 
	}
}
}
