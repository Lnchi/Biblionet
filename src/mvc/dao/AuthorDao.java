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
    // On insèrer les données de l'auteur dans la table 'Author'
   // On utilise des instructions préparées ici pour insérer un tas de données
preparedStatement = con.prepareStatement("insert into Author(num,lastName,firstName,dob) values (?,?,?,?)"); 
preparedStatement.setString(1, num);
preparedStatement.setString(2, lastName);
preparedStatement.setString(3, firstName);
preparedStatement.setString(4, dob);
int i= preparedStatement.executeUpdate(); //renvoie le nombre de lignes affectées par l'exécution de l'instruction SQL. 
if (i!=0) 
//S'assurer que les données ont été insérées dans la base de données
	  return "Success"; } 
catch(SQLException e) { e.printStackTrace(); }
return "Error"; //En cas d'échec,on envoi un message d'erreur à partir d'ici.
}} 


