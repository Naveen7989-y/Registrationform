package com.servlets;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.helper.FactoryProvider;
import com.user.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class saveUser
 */
//@WebServlet("/saveUser")
public class saveUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public saveUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String dob=request.getParameter("dob");
		String createpassword=request.getParameter("createpassword");
		String email=request.getParameter("email");
		String contactno=request.getParameter("contactno");
		
		
		User u=new User();
		u.setFirstname(firstname);
		u.setLastname(lastname);
		u.setDob(dob);
		u.setContactno(contactno);
		u.setEmail(email);
		u.setCreatepassword(createpassword);
		
		
		Session s=FactoryProvider.getSessionFactory().openSession();
		Transaction ts=s.beginTransaction();
		
		s.save(u);
		ts.commit();
		

}
}