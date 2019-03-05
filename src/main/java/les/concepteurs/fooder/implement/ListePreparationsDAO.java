package les.concepteurs.fooder.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import les.concepteurs.fooder.dao.DAO;
import les.concepteurs.fooder.metier.ListePreparations;
import les.concepteurs.fooder.metier.Preparation;

/**
 * Classe qui récupère en base les données de préparation de recettes, 
 * puis crée des objets préparation correspondant, 
 * puis ajoute ces objets dans une arraylist ListePreparations 
 * @author stag05
 *
 */
public class ListePreparationsDAO extends DAO<ListePreparations> {
	
	PreparedStatement prepare = null;
	
	public ListePreparationsDAO(Connection conn) {
		super(conn);		
	}

	@Override
	public boolean create(ListePreparations obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ListePreparations obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ListePreparations obj) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Methode de recherche en base des données concernant les préparation de recettes.
	 * puis crée les objets Preparation.
	 * puis les ajoute à ListePreparation (ArrayList) 
	 */
	@Override
	public ListePreparations find(int id) throws SQLException {
		
		ListePreparations listePreparations = null;
		
		String requetePrepare = "";
		
		try {
			
			prepare = connect.prepareStatement(requetePrepare);
			
			//Set du ? par l'id envoyé qui se trouve à la position 1 de la table se_prepare
			prepare.setInt(1, id);;
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			if (prepare != null)	prepare.close();
			if (this.connect != null) this.connect.close();
		}
		
		return listePreparations;
	}


	

}
