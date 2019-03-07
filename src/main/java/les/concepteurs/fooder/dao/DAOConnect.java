package les.concepteurs.fooder.dao;

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
//	private String url 	= "jdbc:oracle:thin:@localhost:1521:XE"; // for OracleDB 
	private String url 	= "jdbc:mysql://localhost:3306/fooder";
	private String user = "fooder";
	private String pwd  = "fooderpw";
	
	   
	//Constructeur privé
	private DAOConnect(){
		
		String infoConnect = url +"?user="+ user +"&password="+ pwd
	    						 +"&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		
		try {
			  
			//ODBC ===> connect = DriverManager.getConnection(url, user, pwd);  // for OracleDB
		    connect = DriverManager.getConnection(infoConnect);
		    
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
