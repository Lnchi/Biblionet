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
    //On insère les données du livre dans la table 'Book'	
   //On utilise des instructions préparées ici pour insérer un tas de données
preparedStatement = con.prepareStatement("insert into Book(issn,title,abstractB,nbPages,field,num) values (?,?,?,?,?,?)");  
preparedStatement.setString(1, issn);
preparedStatement.setString(2, title);
preparedStatement.setString(3, abstractB);
preparedStatement.setString(4, nbPages);
preparedStatement.setString(5, field);
preparedStatement.setString(6, num);
int i= preparedStatement.executeUpdate();//renvoie le nombre de lignes affectées par l'exécution de l'instruction SQL.
if (i!=0) 
//S'assurer que les données ont été insérées dans la base de données
	  return "Success"; } 
catch(SQLException e) { e.printStackTrace(); }
return "Error"; //En cas d'échec,On envoi un message d'erreur
}} 


