package mvc.util;
import java.sql.Connection;
import java.sql.DriverManager;
 public class DBConnection {
	// Méthode pour créer une connexion à la base de données
	public static Connection createConnection()
	 { Connection con = null;
	  // URL MySQL suivie du nom de la base de données
	     String url = "jdbc:mysql://localhost:3306/BiblioNet?"
	     	       	+ "zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC " ;
         String username = "root";// Nom d'utilisateur MySQL
	     String password = "lynda"; // Mot de pass MySQL 
	     try 
	     { try // Chargement des pilotes MySQL (chargement du pilote JDBC)
	         {Class.forName("com.mysql.cj.jdbc.Driver"); 
	         } 
	         catch (ClassNotFoundException e)
	         { e.printStackTrace();
	         }       
	        //Connexion à la base de données MySQL
	         con = DriverManager.getConnection(url, username, password); 
	         System.out.println("Impression de l'objet de connexion"+con);
	     } catch (Exception e) 
	     {e.printStackTrace();
	     }   
	     return con; 
	 }}
