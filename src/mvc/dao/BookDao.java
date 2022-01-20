package mvc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import mvc.util.DBConnection; 
import mvc.bean.UserAuthorBookBean;
public class BookDao {
public String addBook(UserAuthorBookBean bookBean)
{     String issn =bookBean.getIssn(); 
	  String title =bookBean.getTitle(); 
	  String abstractB = bookBean.getAbstractB();
	  String nbPages = bookBean.getNbPages();
	  String field = bookBean.getField();
	  String num = bookBean.getNum();
	  
Connection con = null; 
PreparedStatement preparedStatement = null; 
try { con= DBConnection.createConnection();
    //On ins�re les donn�es du livre dans la table 'Book'	
   //On utilise des instructions pr�par�es ici pour ins�rer un tas de donn�es
preparedStatement = con.prepareStatement("insert into Book(issn,title,abstractB,nbPages,field,num) values (?,?,?,?,?,?)");  
preparedStatement.setString(1, issn);
preparedStatement.setString(2, title);
preparedStatement.setString(3, abstractB);
preparedStatement.setString(4, nbPages);
preparedStatement.setString(5, field);
preparedStatement.setString(6, num);
int i= preparedStatement.executeUpdate();//renvoie le nombre de lignes affect�es par l'ex�cution de l'instruction SQL.
if (i!=0) 
//S'assurer que les donn�es ont �t� ins�r�es dans la base de donn�es
	  return "Success"; } 
catch(SQLException e) { e.printStackTrace(); }
return "Error"; //En cas d'�chec,On envoi un message d'erreur
}} 


