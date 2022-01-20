package mvc.util;
import java.sql.Connection;
import java.sql.DriverManager;
 public class DBConnection {
	public static Connection createConnection()
	 { Connection con = null;
	  // URL MySQL suivie du nom de la base de donn�es
	     String url = "jdbc:mysql://localhost:3306/BiblioNet?"
	     	       	+ "zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC " ;
         String username = "root";// Nom d'utilisateur MySQL
	     String password = "lynda"; // Mot de pass MySQL 
	     try 
	     { try // chargement des pilotes MySQL
	         {Class.forName("com.mysql.cj.jdbc.Driver"); 
	         } 
	         catch (ClassNotFoundException e)
	         { e.printStackTrace();
	         }       
	        //Connexion � la base de donn�es MySQL
	         con = DriverManager.getConnection(url, username, password); 
	         System.out.println("Impression de l'objet de connexion"+con);
	     } catch (Exception e) 
	     {e.printStackTrace();
	     }   
	     return con; 
	 }}
