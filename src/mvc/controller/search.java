package mvc.controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.bean.UserAuthorBookBean;
import mvc.util.DBConnection;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
     public search() {
        super();}
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
		   throws ServletException, IOException {}
   protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		    //On déclare une liste de type UserAuthorBookBean 
		    List<UserAuthorBookBean> booklist = new ArrayList<UserAuthorBookBean>() ;
		
		Connection con = null;
		con= DBConnection.createConnection();
        Statement st = null ; 
		ResultSet result = null ; 
          try {
				
				st= con.createStatement();
				
			} catch (SQLException e) {
				e.printStackTrace(); }
	    //On affecte l'entrée dans une variable locale
		String r = request.getParameter("req"); 
		String data  ; 
		
       if( r!=null){ //bookAuthor est une view contenant toutes le données nécessaires des livres et auteurs

       data="select* from biblionet.bookAuthor where title like '"+r+"' or field like '"+r+"' or"
       		+ " issn like '"+r+"' or lastName like '"+r+"'  ";
            } 
       
       else {  //Dans le cas, l'utilisateur clique sur search sans insérer aucune information,
    	   // on selectionne tous les livres  
    	    data="select* from biblionet.bookAuthor order by issn"; 
			
			}  try {
					result=st.executeQuery(data); //Exécuter objet Statement génère objets ResultSet
                    //qui est une table de donnée représentant un jeux de résultats
                    //de base de données 
                  } catch (SQLException e) {
					e.printStackTrace();}
		      try {while (result.next()) { //La méthode next () de l'interface ResultSet déplace 
		//le pointeur de l'objet (ResultSet) actuel vers la ligne suivante, à partir de la position actuelle.
                  UserAuthorBookBean book = new UserAuthorBookBean() ;
                  //On affecte tous les détails nécessaire aux variables locales
			      String issn = result.getString("issn"); 
				  String title = result.getString("title"); 
				  String abstractB = result.getString("abstractB");
				  String nbPages = result.getString("nbPages"); 
				  String field = result.getString("field"); 
				  String num = result.getString("num"); 
				  String lastName = result.getString("lastName"); 
				  String firstName =result.getString("firstName"); 
				  String dob = result.getString("dob");
				 //On appelle UserAuthorBookBean pour définir toutes les données nécessaire à l'aide des setters 
				  book.setIssn(issn);
				  book.setTitle(title) ;
				  book.setAbstractB(abstractB); 
				  book.setNbPages(nbPages);
				  book.setField(field);
				  book.setNum(num) ;
				  book.setLastName(lastName) ;
				  book.setFirstName(firstName);
				  book.setDob(dob);
				  booklist.add(book); //On remplit la liste 
					}} catch (SQLException e) {
					e.printStackTrace();}	
		request.setAttribute("booklist",booklist); 
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/searchR.jsp");
		dispatcher.forward(request, response);}}
