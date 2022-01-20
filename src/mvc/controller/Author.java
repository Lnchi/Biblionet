package mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.bean.UserAuthorBookBean;
import mvc.dao.AuthorDao;
/**
 * Servlet implementation class Author
 */
@WebServlet("/Author")
public class Author extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Author() {
		super();} 
protected void doPost(HttpServletRequest request, HttpServletResponse
  response) throws ServletException, IOException { 
        // Copie de tous les param�tres d'entr�e dans des variables locales
		String num = request.getParameter("num");
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String dob = request.getParameter("dob");
  UserAuthorBookBean authorBean = new UserAuthorBookBean();  
  //Utilisation de Java Beans qui est Un moyen le plus simple de jouer avec un groupe de donn�es associ�es
  authorBean.setNum(num);
  authorBean.setLastName(lastName);
  authorBean.setFirstName(firstName);
  authorBean.setDob(dob);
  //La logique de base de l'ajout d'un auteur est pr�sente ici.
  //Nous allons ins�rer les donn�es de l'auteur dans la base de donn�es. 
  AuthorDao authorDao = new AuthorDao();
  String authorAdded =  authorDao.addAuthor(authorBean);
  if(authorAdded.equals("Success"))  // En cas de succ�s, on affiche un message de succ�s sur la page 
		{ request.getRequestDispatcher("addAuthor.jsp").forward(request, response); 
	  }
  else { request.setAttribute("messError", authorAdded); 
//En cas d'�chec,on affiche un message d'erreur � l'dministrateur.
  request.getRequestDispatcher("AddAuthor.jsp").forward(request, response); }} }
	

