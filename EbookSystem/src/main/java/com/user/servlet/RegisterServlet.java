package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAOImpl;
import com.DB.DBConnect;
import com.entity.User;

@WebServlet("/register")

public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String phhno = req.getParameter("phhno");
			String password = req.getParameter("password");
			String check = req.getParameter("check");

			// System.out.println(name+""+email+""+phhno+""+password+""+check);

			User us = new User();
			us.setName(name);
			us.setEmail(email);
			us.setPhhno(phhno);
			us.setPassword(password);

			HttpSession session = req.getSession();
			
			if(check!=null)
			{
				UserDAOImpl dao = new UserDAOImpl(DBConnect.getConn());
				boolean f = dao.userRegister(us);

				if (f)
				{
					//System.out.println("User Register success...");

					session.setAttribute("succMsg", "Registration Successfully...");
					resp.sendRedirect("register.jsp");
				} else
				{
					//System.out.println("Something is wrong...");
					session.setAttribute("failedMsg", "Something is wrong...");
					resp.sendRedirect("register.jsp");
				}
			}else {
				//System.out.println("Please agree terms and condition...");
				session.setAttribute("failedMsg", "Please agree terms and condition...");
				resp.sendRedirect("register.jsp");
			}
				

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
