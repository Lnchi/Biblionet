package mvc.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class logout
 */
@WebServlet("/logout")
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public logout() {
        super();}
        //ce servlet est destiné à gérer la déconnexion d'un utilisateur. Lorsqu'un utilisateur envoie une requête GET (par exemple, en cliquant sur un bouton de déconnexion), cette classe servlet supprime les informations de session de l'utilisateur et le redirige vers la page d'accueil de l'application.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		PrintWriter out=response.getWriter();  
		 //Utiliser la session existante si elle existe ou renvoyer null
		HttpSession session=request.getSession(false);
		session.removeAttribute("username");
		session.removeAttribute("password"); 
	    session.invalidate(); 
	    out.println("You are logged out");
		
		request.getRequestDispatcher("home.jsp").forward(request, response);
		/* session.getMaxInactiveInterval(); */
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
