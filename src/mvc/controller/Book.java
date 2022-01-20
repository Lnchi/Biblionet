package mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.bean.UserAuthorBookBean;
import mvc.dao.BookDao;
/**
 * Servlet implementation class Book
 */
@WebServlet("/Book")
public class Book extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Book() {
		super();}
  protected void doPost(HttpServletRequest request, HttpServletResponse
  response) throws ServletException, IOException { 
  // Copie de tous les param�tres d'entr�e dans des variables locales
		String issn = request.getParameter("issn");
		String title = request.getParameter("title");
		String abstractB = request.getParameter("abstractB");
		String nbPages = request.getParameter("nbPages");
		String field = request.getParameter("field");
		String num = request.getParameter("num");
  // Utilisation de Java Beans qui est un moyen le plus simple de jouer avec un groupe de donn�es associ�es
  UserAuthorBookBean bookBean = new UserAuthorBookBean();  
  bookBean.setIssn(issn);
  bookBean.setTitle(title);
  bookBean.setAbstractB(abstractB);
  bookBean.setNbPages(nbPages);
  bookBean.setField(field);  
  bookBean.setNum(num);
  //La logique de base d'un ajout d'un livre est pr�sente ici. 
  //Nous allons ins�rer les donn�es utilisateur dans la base de donn�es.  
   BookDao bookDao = new BookDao();
   String bookAdded = bookDao.addBook(bookBean);
    if(bookAdded.equals("Success")) // En cas de succ�s,on afficher un message de succ�s � l'administrateur sur la page
	  { request.getRequestDispatcher("addBook.jsp").forward(request, response); 
	  request.setAttribute("messSuccess", bookAdded);}
  else { // En cas d'�chec,on affiche un message d'erreur.
  request.setAttribute("messError", bookAdded);
  request.getRequestDispatcher("addBook.jsp").forward(request, response);}}}
	

