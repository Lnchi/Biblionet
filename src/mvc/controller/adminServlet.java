package mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class adminServlet
 */
@WebServlet("/adminServlet")

public class adminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public adminServlet() {
        super();}
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
	//Utiliser la session existante si elle existe ou renvoyer null
		HttpSession session=request.getSession(false); 
		if(session!=null) //L'admin est redirigé à sa page d'acceuil
		{ request.getRequestDispatcher("Admin.jsp").forward(request, response); } 
		else { request.getRequestDispatcher("home.jsp").forward(request, response);  }}


		}
