package com.studentmanag;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	
	public static Connection createC() throws IOException
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user = "root";
			String password = "Dreams@7876";
			String url = "jdbc:mysql://localhost:3306/student_manag";
			con= DriverManager.getConnection(url,user,password);
			
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}
