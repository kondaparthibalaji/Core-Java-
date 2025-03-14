package com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentCoursemethods {
	
						 public void insertdata() {
							 try {
							Connection con=JDBCconnection.connect();
								//Statement st=con.createStatement();
								PreparedStatement ps=con.prepareStatement("insert into studentcourse values(?,?,?)");
								ps.setInt(1, 1004);
								ps.setInt(2,5);
								ps.setInt(3, 97015);
								int n=ps.executeUpdate();
							} 
							catch (Exception e) {
								System.out.println(e); 
							}
					 }
						 public void selectdata() {
								try {
									Connection con=JDBCconnection.connect();
									PreparedStatement ps1=con.prepareStatement("select * from studentcourse");
									
									ResultSet rs=ps1.executeQuery();
									while(rs.next()) {
										System.out.println(rs.getInt(1)+ ":" +rs.getInt(2)+ ":" + rs.getInt(3));
									}
								}
								catch(Exception e) {
									System.out.println(e);
								}
							 }
						 
						 public void data() {
						 		try {
						 			Connection con=JDBCconnection.connect();
						 			PreparedStatement ps2=con.prepareStatement("select * from studentcourse where studentcourseid=?");
						 			ps2.setInt(1,1001);
						 			ResultSet rs=ps2.executeQuery();
						 			rs.next();
						 				System.out.println(rs.getInt(1)+ ":" +rs.getInt(2)+ ":" +rs.getInt(3));
						 			
						 		}
						 		catch(Exception e) {
						 			System.out.println(e);
						 		}
						 	 }
						 
						 public void updatedata() {
								try {
									Connection con=JDBCconnection.connect();
									PreparedStatement ps3=con.prepareStatement("update studentcourse set studentid=? where studentcourseid=? ");
									ps3.setInt(1,97015);
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
						 			PreparedStatement ps4=con.prepareStatement("delete from studentcourse where studentcourseid=? ");
						 			ps4.setInt(1,1004);
						 			int n=ps4.executeUpdate();
						 		}
						 		catch(Exception e) {
						 			System.out.println(e);
						 		}
							 
						 }
					}

