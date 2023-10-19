package mvc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import mvc.util.DBConnection; 
import mvc.bean.UserAuthorBookBean;
public class AuthorDao {
// Récupération des données de l'auteur depuis l'objet authorBean	
public String addAuthor(UserAuthorBookBean authorBean) 
{         String num =authorBean.getNum(); 
	  String lastName =authorBean.getLastName(); 
	  String firstName = authorBean.getFirstName();
	  String dob = authorBean.getDob();

Connection con = null; 


PreparedStatement preparedStatement = null; 
try { con= DBConnection.createConnection();
// Préparation de la requête SQL pour insérer les données dans la table 'Author'
// Nous utilisons une instruction préparée pour insérer un ensemble de données
preparedStatement = con.prepareStatement("insert into Author(num,lastName,firstName,dob) values (?,?,?,?)"); 
// Définition des valeurs des marqueurs de position dans la requête SQL
preparedStatement.setString(1, num);
preparedStatement.setString(2, lastName);
preparedStatement.setString(3, firstName);
preparedStatement.setString(4, dob);
// Exécution de la requête SQL et récupération du nombre de lignes affectées
int i= preparedStatement.executeUpdate(); 
if (i!=0) 
//S'assurer que les données ont été insérées dans la base de données
	  return "Success"; } 
catch(SQLException e) { e.printStackTrace(); }   // En cas d'erreur SQL, afficher la trace de l'erreur
return "Error"; //En cas d'échec,on envoi un message d'erreur à partir d'ici.
}} 


