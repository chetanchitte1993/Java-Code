package com.studentmanag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Start {

	public static void main(String[] args) throws IOException
	{
		System.out.println("Welcome to StudentManagementApp");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to Delete student");
			System.out.println("PRESS 3 to display student");
			System.out.println("PRESS 4 to exit app");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1)
			{	//........... Add Student............//
				
				System.out.println("Enter user name: ");
				String name=br.readLine();
				
				System.out.println("Enter user phone: ");
				String phone=br.readLine();
				
				System.out.println("Enter user City: ");
				String city=br.readLine();
				
				Student st= new Student(name,phone,city);
				boolean ans = StudentDao.insertStudentToDB(st);
				if(ans)
				{
					System.out.println("Student is added successfully..");
				}
				else
				{
					System.out.println("Something went wrong try again...");
				}
				System.out.println(st);
			}
			else if(c==2)
			{
				// Delete id
				
				System.out.println("Enter student id to delete: ");
				int userId = Integer.parseInt(br.readLine());
				boolean f= StudentDao.deletStudent(userId);
				if(f)
				{
					System.out.println("Deleted....");
				}
				else
				{
					System.out.println("Something went wrong....");
				}
			}
			else if(c==3)
			{
				//display student
				StudentDao.showAllStudent();
				
			}
			else if(c==4)
			{
				//exit student
				break;
			}
			else
			{
				
			}
		}
		System.out.println("Thank for using my Application");
		System.out.println("See you soon....");

	}
}