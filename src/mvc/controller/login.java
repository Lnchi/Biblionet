package mvc.controller;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mvc.bean.UserAuthorBookBean;
import mvc.dao.UserDao;
/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
    	 // Copie de tous les paramètres d'entrée dans des variables locales
		String username = req.getParameter("username");
		String password = req.getParameter("password"); 
		
		  UserDao userDao = new UserDao();
		  try {
	            UserAuthorBookBean user = userDao.checkLogin(username, password);
		  
		if(user != null) 
		{   //Utiliser la session existante si elle existe ou créer une nouvelle session
			HttpSession session = req.getSession(true); 
			/* Mise en session le username(chaine de caractère) */
			session.setAttribute("username", username); 
			/*
			 * session.setMaxInactiveInterval(30); // 30 seconds
			 */			resp.sendRedirect("adminServlet");
		} 
		else { req.getRequestDispatcher("home.jsp").forward(req, resp);}}
		  catch (SQLException | ClassNotFoundException ex) {
	            throw new ServletException(ex);
	        }
   }} 
