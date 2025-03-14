package com.JDBC;

import java.math.BigInteger;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class Insert{
	 public void insertdata() {
			 try {
				Connection con=JDBCconnection.connect();
				//Statement st=con.createStatement();
//				BigInteger b=new BigInteger("9708967890");
				PreparedStatement ps=con.prepareStatement("insert into admin values(?,?,?,?,?)");
				ps.setInt(1, 104);
				ps.setString(2,"BALU");
				ps.setLong(3, 9701574918L);
				ps.setString(4, "balajikondaparthi@gmail.com");
				ps.setString(5, "97015@balu");
				int n=ps.executeUpdate();
			} 
			catch (Exception e) {
				System.out.println(e); 
			}
	 }
}

 class Select{
	 public void selectdata() {
		try {
			Connection con=JDBCconnection.connect();
			PreparedStatement ps1=con.prepareStatement("select * from admin");
			
			ResultSet rs=ps1.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ ":" +rs.getString(2)+ ":" + rs.getLong(3)+":"+rs.getString(4)+":"+rs.getString(5));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	 }
	
}
 
 class Method{
 	public void data() {
 		try {
 			Connection con=JDBCconnection.connect();
 			PreparedStatement ps2=con.prepareStatement("select * from admin where adminid=101");
 			
 			ResultSet rs=ps2.executeQuery();
 			rs.next();
 				System.out.println(rs.getInt(1)+ ":" +rs.getString(2)+ ":" +rs.getLong(3)+":"+rs.getString(4)+":"+rs.getString(5));
 			
 		}
 		catch(Exception e) {
 			System.out.println(e);
 		}
 	 }
 	
 }
 
 class Update{
		public void updatedata() {
			try {
				Connection con=JDBCconnection.connect();
				PreparedStatement ps3=con.prepareStatement("update admin set mobilenumber=? where adminid=? ");
				ps3.setString(1,"7013803812");
				ps3.setInt(2,102);
				int n=ps3.executeUpdate();
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		 }
		
	}
 
 
 class Delete{
	 public void deletedata() {
		 try {
	 			Connection con=JDBCconnection.connect();
	 			PreparedStatement ps4=con.prepareStatement("delete from admin where adminid=? ");
	 			ps4.setInt(1,104);
	 			int n=ps4.executeUpdate();
	 		}
	 		catch(Exception e) {
	 			System.out.println(e);
	 		}
		 
	 }
 }
 
 class Procedure{
	 public void proceduredata() {
		 try {
	 			Connection con=JDBCconnection.connect();
	 			//PreparedStatement ps4=con.prepareStatement("delete from admin where adminid=? ");
	 			String sn="{Call jdbc_procedure(?,?,?,?)}";
	 			CallableStatement cs=con.prepareCall(sn);
	 			cs.setInt(1,204);
	 			cs.setString(2,"testing");
	 			cs.setInt(3, 27000);
	 			cs.setInt(4, 7);
	 			boolean status=cs.execute();
	 			System.out.println(status);
	 		}
	 		catch(Exception e) {
	 			System.out.println(e);
	 		}
		 
	 }
 }
  


		
