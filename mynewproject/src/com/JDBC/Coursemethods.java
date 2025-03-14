package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Coursemethods {

	 public void insertdata() {
		 try {
			Connection con=JDBCconnection.connect();
			//Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into course values(?,?,?,?)");
			ps.setInt(1,204);
			ps.setString(2,"testing");
			ps.setInt(3, 2700);
			ps.setInt(4, 7);
			int n=ps.executeUpdate();
		} 
		catch (Exception e) {
			System.out.println(e); 
		}
 }
	 public void selectdata() {
			try {
				Connection con=JDBCconnection.connect();
				PreparedStatement ps1=con.prepareStatement("select * from course");
				
				ResultSet rs=ps1.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+ ":" +rs.getString(2)+ ":" + rs.getInt(3)+":"+rs.getInt(4));
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 }
	 
	 public void data() {
	 		try {
	 			Connection con=JDBCconnection.connect();
	 			PreparedStatement ps2=con.prepareStatement("select * from course where courseid=?");
	 			ps2.setInt(1,1001);
	 			ResultSet rs=ps2.executeQuery();
	 			rs.next();
	 				System.out.println(rs.getInt(1)+ ":" +rs.getString(2)+ ":" +rs.getInt(3)+":"+rs.getInt(4));
	 			
	 		}
	 		catch(Exception e) {
	 			System.out.println(e);
	 		}
	 	 }
	 
	 public void updatedata() {
			try {
				Connection con=JDBCconnection.connect();
				PreparedStatement ps3=con.prepareStatement("update course set coursename=? where courseid=? ");
				ps3.setString(1,"power bi");
				ps3.setInt(2,203);
				int n=ps3.executeUpdate();
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 }
	 
	 public void deletedata() {
		 try {
	 			Connection con=JDBCconnection.connect();
	 			PreparedStatement ps4=con.prepareStatement("delete from course where courseid=? ");
	 			ps4.setInt(1,204);
	 			int n=ps4.executeUpdate();
	 		}
	 		catch(Exception e) {
	 			System.out.println(e);
	 		}
		 
	 }
}

