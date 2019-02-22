package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Singleton de connexion a la Base <br>
 * L'instance de connexion ne peut etre recuperee que par la methode statique getConnexion() <br>
 * ex : Connexion connexion = DAOConnect.getConnexion();
 * @author Philippe Cohen
 */
public class DAOConnect {
	
	//Objet Connection
	private static Connection connect;

	//Infos de connexion
	private String url 	= "jdbc:oracle:thin:@localhost:1521:XE";
	private String user = "fooder";
	private String pwd  = "fooderpw";
	
	   
	//Constructeur privé
	private DAOConnect(){
	  try {
		  
	    connect = DriverManager.getConnection(url, user, pwd);
	    
	  } catch (SQLException e) {
	     e.printStackTrace();
	  }
	}
	   
	/**
	 * Methode qui retourne l'instance ou va la creer si elle n'existe pas
	 * @return Connection
	 */
	public static Connection getConnexion(){
		if(connect == null){
	    	new DAOConnect();
		}
		return connect;   
	}   

}
