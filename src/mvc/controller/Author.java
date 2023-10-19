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
/**Gérer une requête HTTP POST pour ajouter des données d'auteur à partir d'un formulaire web, les stocker dans un objet Java (Java Bean),
puis les insérer dans une base de données via une classe DAO (Data Access Object). En cas de succès ou d'échec, des messages sont renvoyés à l'utilisateur. */
protected void doPost(HttpServletRequest request, HttpServletResponse
  response) throws ServletException, IOException { 
        // Copie de tous les paramètres d'entrée dans des variables locales
		String num = request.getParameter("num");
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String dob = request.getParameter("dob");
  // Création d'une instance de UserAuthorBookBean pour stocker les données
  UserAuthorBookBean authorBean = new UserAuthorBookBean();  
  //Utilisation de Java Beans qui est Un moyen le plus simple de jouer avec un groupe de données associées
  authorBean.setNum(num);
  authorBean.setLastName(lastName);
  authorBean.setFirstName(firstName);
  authorBean.setDob(dob);
  //La logique de base de l'ajout d'un auteur est présente ici.
  //Nous allons insérer les données de l'auteur dans la base de données. 
  AuthorDao authorDao = new AuthorDao();
  String authorAdded =  authorDao.addAuthor(authorBean);
  if(authorAdded.equals("Success"))  // En cas de succès, on affiche un message de succès sur la page 
		{ request.getRequestDispatcher("addAuthor.jsp").forward(request, response); 
	  }
  else { request.setAttribute("messError", authorAdded); 
//En cas d'échec,on affiche un message d'erreur à l'dministrateur.
  request.getRequestDispatcher("AddAuthor.jsp").forward(request, response); }} }
	

