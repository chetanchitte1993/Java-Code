package com.studentmanag;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class StudentDao {
	public static boolean insertStudentToDB(Student st)
	{
		boolean f = false;
		
		try
		{
			String q = "insert into students(sname,sphone,scity)"+ "values(?,?,?)";
			Connection con = CP.createC();
			PreparedStatement ps=con.prepareStatement(q);
			ps.setString(1, st.getStudentName());
			ps.setString(2, st.getStudentPhone());
			ps.setString(3, st.getStudentCity());
			
			ps.executeUpdate();
			f=true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
			 
		}
		return f;
	}

	public static boolean deletStudent(int userId) {
boolean f = false;
		
		try
		{
			Connection con = CP.createC();
			String q = "delete form student where sid=?";
			PreparedStatement ps=con.prepareStatement(q);
			ps.setInt(1,(userId));
			ps.executeUpdate();
			f=true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
			 
		}
		return f;
		
	}

	public static void showAllStudent() {
		@SuppressWarnings("unused")
		boolean f= false;
		try
		{
			Connection con = CP.createC();
			String q = "select * from students";
			java.sql.Statement stmt = con.createStatement();
			ResultSet set = ((java.sql.Statement) stmt).executeQuery(q);
			
			while (set.next())
			{
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString("scity");
				
				System.out.println("Id: "+ id);
				System.out.println("Name: "+ name);
				System.out.println("Phone: "+ phone);
				System.out.println("City: "+ city);
				System.out.println("*******************************");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			 
		}
	
		
	}

}
