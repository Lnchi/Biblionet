package mvc.dao;
import java.sql.*;

import mvc.bean.UserAuthorBookBean;
import mvc.util.DBConnection;
 
public class UserDao {
 
    public UserAuthorBookBean checkLogin(String username, String password)
    		throws SQLException,
            ClassNotFoundException {
    	
    	Connection con = null; //On a besoin d'un objet Connection pour cr�er un objet statement 
    	con= DBConnection.createConnection();
    	
        String sql = "SELECT * FROM user WHERE username = ? and password = ?";
        PreparedStatement statement = con.prepareStatement(sql); //Pr�compiler instruction SQL 
                                                            //contanant des param�tres d'entr�es
        statement.setString(1, username);
        statement.setString(2, password);
 
        ResultSet res = statement.executeQuery(); //Ex�cuter objet Statement g�n�re objets ResultSet
                               //qui est une table de donn�e repr�sentant un jeux de r�sultats
                               //de base de donn�es 
 
        UserAuthorBookBean user = null;
 
        if (res.next()) { //La m�thode next () de l'interface ResultSet d�place 
        	//le pointeur de l'objet (ResultSet) actuel vers la ligne suivante, � partir de la position actuelle.
            user = new UserAuthorBookBean();
            user.setUsername(res.getString("username"));
            user.setPassword(password);
        }  con.close();
 
        return user;}
}