package com.admin.sarvlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.DAO.BookDAOImpl;
import com.DB.DBConnect;
import com.entity.BookDtls;

@MultipartConfig
@WebServlet("/add_books")
public class BooksAdd extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			// System.out.println("Im here");
			String bookName = req.getParameter("bname");
			String author = req.getParameter("author");
			String price = req.getParameter("price");
			String categories = req.getParameter("categories");
			String status = req.getParameter("status");
			Part part = req.getPart("bimg");
			String fileName = part.getSubmittedFileName();

			// System.out.println(fileName);
			BookDtls b = new BookDtls(bookName, author, price, categories, status, fileName, "admin");
			// System.out.println(b);
			BookDAOImpl dao = new BookDAOImpl(DBConnect.getConn());
			
			
			
			  boolean f = dao.addBooks(b);
			  
			  HttpSession session = req.getSession();
			  
			  if(f) {
			  
			  String path = getServletContext().getRealPath("")+"photos";
			  
			  File file = new File(path); part.write(path + File.separator + fileName);
			  
			  session.setAttribute("succMsg","Book Add Sucessfully");
			  resp.sendRedirect("admin/add_books.jsp"); 
			  } else
			  {
			  session.setAttribute("failedMsg","Something is wrong on server");
			  resp.sendRedirect("admin/add_books.jsp");
			  }
			 
			 

		} catch (Exception e) {
			// System.out.println("i catched exception");
			e.printStackTrace();
		}
	}

}
