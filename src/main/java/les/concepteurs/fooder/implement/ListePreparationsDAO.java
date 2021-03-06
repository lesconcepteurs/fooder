package les.concepteurs.fooder.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	ListePreparations listePreparations = null;
	
	//nom des champs dans les tables 
	private final String 	NOMPREPA 	= "nom_type_prepa";
	private final String	DUREE 		= "duree";
	private final String 	NOMUNITE 	= "nom_unite_duree";
	private final String	DUREESECOND = "duree_second";
	
	
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
	 * Methode de recherche en base des données concernant les préparations de recettes.
	 * puis crée les objets Preparation.
	 * puis les ajoute à ListePreparation (ArrayList) 
	 */
	@Override
	public ListePreparations find(int id) throws SQLException {
		
		listePreparations = new ListePreparations();
		
		String requetePrepare = "SELECT sp.id_rec, tp.nom_type_prepa, sp.duree, ud.nom_unite_duree, sp.duree_second "
								+ "FROM se_prepare sp "
								+ "LEFT JOIN type_prepa tp ON sp.id_type_prepa = tp.id_type_prepa "
								+ "LEFT JOIN unite_duree ud ON sp.id_unite_duree = ud.id_unite_duree "
								+ "WHERE id_rec=?;";
			
		prepare = connect.prepareStatement(requetePrepare);
			
		//Set du ? par l'id envoyé qui se trouve à la position 1 de la table se_prepare
		prepare.setInt(1, id);
			
		ResultSet result = prepare.executeQuery();
			
		while (result.next()) {
					
			//Creation d'un objet Preparation.			
			Preparation preparation = new Preparation(
					result.getString(NOMPREPA), 
					result.getInt(DUREE), 
					result.getString(NOMUNITE), 
					result.getInt(DUREESECOND)
					);
				
			//ajout dans la listePreparation
			listePreparations.add(preparation);
		}

		prepare.close();
		
		return listePreparations;
	}

}
