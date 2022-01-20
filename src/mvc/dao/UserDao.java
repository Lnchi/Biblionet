package mvc.dao;
import java.sql.*;

import mvc.bean.UserAuthorBookBean;
import mvc.util.DBConnection;
 
public class UserDao {
 
    public UserAuthorBookBean checkLogin(String username, String password)
    		throws SQLException,
            ClassNotFoundException {
    	
    	Connection con = null; //On a besoin d'un objet Connection pour créer un objet statement 
    	con= DBConnection.createConnection();
    	
        String sql = "SELECT * FROM user WHERE username = ? and password = ?";
        PreparedStatement statement = con.prepareStatement(sql); //Précompiler instruction SQL 
                                                            //contanant des paramètres d'entrées
        statement.setString(1, username);
        statement.setString(2, password);
 
        ResultSet res = statement.executeQuery(); //Exécuter objet Statement génère objets ResultSet
                               //qui est une table de donnée représentant un jeux de résultats
                               //de base de données 
 
        UserAuthorBookBean user = null;
 
        if (res.next()) { //La méthode next () de l'interface ResultSet déplace 
        	//le pointeur de l'objet (ResultSet) actuel vers la ligne suivante, à partir de la position actuelle.
            user = new UserAuthorBookBean();
            user.setUsername(res.getString("username"));
            user.setPassword(password);
        }  con.close();
 
        return user;}
}