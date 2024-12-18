package com.servlets;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.helper.FactoryProvider;

import com.user.User;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Session session=FactoryProvider.getSessionFactory().openSession();
		try {
            Query<User> query = session.createQuery("FROM User WHERE email = :email AND createpassword = :password", User.class);
            query.setParameter("email", email);
            query.setParameter("password", password);

            User user = query.uniqueResult();

            if (user != null) {
                // Login success
                HttpSession httpSession = request.getSession();
                httpSession.setAttribute("currentUser", user);
                response.sendRedirect("Welcome.jsp"); // Redirect to a welcome page
            } else {
                // Login failed
                response.sendRedirect("login.jsp?error=Invalid credentials"); // Redirect with error
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

}
}
