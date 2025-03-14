package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Facultymethods {
	 public void insertdata() {
		 try {
			Connection con=JDBCconnection.connect();
			//Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into faculty values(?,?,?,?,?,?)");
			ps.setInt(1, 1004);
			ps.setString(2,"VIJAY");
			ps.setLong(3, 9701574932L);
			ps.setString(4, "vijay@gmail.com");
			ps.setString(5, "97015@vijay");
			ps.setString(6, "inactive");
			int n=ps.executeUpdate();
		} 
		catch (Exception e) {
			System.out.println(e); 
		}
 }
	 public void selectdata() {
			try {
				Connection con=JDBCconnection.connect();
				PreparedStatement ps1=con.prepareStatement("select * from faculty");
				
				ResultSet rs=ps1.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+ ":" +rs.getString(2)+ ":" + rs.getLong(3)+":"+rs.getString(4)+":"+rs.getString(5)+":"+rs.getString(6));
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 }
	 
	 public void data() {
	 		try {
	 			Connection con=JDBCconnection.connect();
	 			PreparedStatement ps2=con.prepareStatement("select * from faculty where facultyid=?");
	 			ps2.setInt(1,1001);
	 			ResultSet rs=ps2.executeQuery();
	 			rs.next();
	 				System.out.println(rs.getInt(1)+ ":" +rs.getString(2)+ ":" +rs.getLong(3)+":"+rs.getString(4)+":"+rs.getString(5)+":"+rs.getString(6));
	 			
	 		}
	 		catch(Exception e) {
	 			System.out.println(e);
	 		}
	 	 }
	 
	 public void updatedata() {
			try {
				Connection con=JDBCconnection.connect();
				PreparedStatement ps3=con.prepareStatement("update faculty set mobilenumber=? where facultyid=? ");
				ps3.setLong(1,9701574933L);
				ps3.setInt(2,1004);
				int n=ps3.executeUpdate();
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 }
	 
	 public void deletedata() {
		 try {
	 			Connection con=JDBCconnection.connect();
	 			PreparedStatement ps4=con.prepareStatement("delete from faculty where facultyid=? ");
	 			ps4.setInt(1,1004);
	 			int n=ps4.executeUpdate();
	 		}
	 		catch(Exception e) {
	 			System.out.println(e);
	 		}
		 
	 }
}
