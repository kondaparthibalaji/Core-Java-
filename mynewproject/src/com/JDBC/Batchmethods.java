package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Batchmethods {

		 public void insertdata() {
			 try {
				Connection con=JDBCconnection.connect();
				//Statement st=con.createStatement();
				PreparedStatement ps=con.prepareStatement("insert into batch values(?,?,?,?)");
				ps.setInt(1, 1004);
				ps.setString(2,"VIJAY");
				ps.setString(3, "");
				ps.setInt(4,5);
				int n=ps.executeUpdate();
			} 
			catch (Exception e) {
				System.out.println(e); 
			}
	 }
		 public void selectdata() {
				try {
					Connection con=JDBCconnection.connect();
					PreparedStatement ps1=con.prepareStatement("select * from batch");
					
					ResultSet rs=ps1.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+ ":" +rs.getString(2)+ ":" + rs.getString(3)+":"+rs.getInt(4));
					}
				}
				catch(Exception e) {
					System.out.println(e);
				}
			 }
		 
		 public void data() {
		 		try {
		 			Connection con=JDBCconnection.connect();
		 			PreparedStatement ps2=con.prepareStatement("select * from batch where batchid=?");
		 			ps2.setInt(1,1001);
		 			ResultSet rs=ps2.executeQuery();
		 			rs.next();
		 				System.out.println(rs.getInt(1)+ ":" +rs.getString(2)+ ":" +rs.getString(3)+":"+rs.getInt(4));
		 			
		 		}
		 		catch(Exception e) {
		 			System.out.println(e);
		 		}
		 	 }
		 
		 public void updatedata() {
				try {
					Connection con=JDBCconnection.connect();
					PreparedStatement ps3=con.prepareStatement("update batch set batchname=? where batchid=? ");
					ps3.setString(1,"");
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
		 			PreparedStatement ps4=con.prepareStatement("delete from batch where batchid=? ");
		 			ps4.setInt(1,1004);
		 			int n=ps4.executeUpdate();
		 		}
		 		catch(Exception e) {
		 			System.out.println(e);
		 		}
			 
		 }
	}


