package mvc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import mvc.util.DBConnection; 
import mvc.bean.UserAuthorBookBean;
public class AuthorDao {
	
public String addAuthor(UserAuthorBookBean authorBean) 
{     String num =authorBean.getNum(); 
	  String lastName =authorBean.getLastName(); 
	  String firstName = authorBean.getFirstName();
	  String dob = authorBean.getDob();

Connection con = null; 
PreparedStatement preparedStatement = null; 
try { con= DBConnection.createConnection();
    // On ins�rer les donn�es de l'auteur dans la table 'Author'
   // On utilise des instructions pr�par�es ici pour ins�rer un tas de donn�es
preparedStatement = con.prepareStatement("insert into Author(num,lastName,firstName,dob) values (?,?,?,?)"); 
preparedStatement.setString(1, num);
preparedStatement.setString(2, lastName);
preparedStatement.setString(3, firstName);
preparedStatement.setString(4, dob);
int i= preparedStatement.executeUpdate(); //renvoie le nombre de lignes affect�es par l'ex�cution de l'instruction SQL. 
if (i!=0) 
//S'assurer que les donn�es ont �t� ins�r�es dans la base de donn�es
	  return "Success"; } 
catch(SQLException e) { e.printStackTrace(); }
return "Error"; //En cas d'�chec,on envoi un message d'erreur � partir d'ici.
}} 


