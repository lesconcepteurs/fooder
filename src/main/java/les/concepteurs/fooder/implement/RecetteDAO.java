package les.concepteurs.fooder.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import les.concepteurs.fooder.dao.DAO;
import les.concepteurs.fooder.metier.ListeDenrees;
import les.concepteurs.fooder.metier.ListeDescriptionsRecette;
import les.concepteurs.fooder.metier.ListePreparations;
import les.concepteurs.fooder.metier.Recette;

/**
 * Classe DAO Pour les recettes
 * @author Philippe Cohen
 */
public class RecetteDAO extends DAO<Recette> {
	
	PreparedStatement prepare = null;

	public RecetteDAO(Connection conn) {
		super(conn);
	}
	
	/*
	 * Definition des methodes CRUD herites
	 * @see dao.DAO
	 */
	
	@Override
	public boolean create(Recette obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Recette obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Recette obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Recette find(int id) throws SQLException {
		
		Recette recette = null;
		
		try {
								
			prepare = connect.prepareStatement(
					"select distinct "
					+ "r.ID_REC,"
					+ "r.NOM_REC,"
					+ "r.PHOTO_REC, "
					+ "r.COMPLEMENT_REC, "
					+ "r.SEL_POIVRE,"
					+ "tr.NOM_TYPER,"
					+ "th.NOM_THEME "
					+ "FROM recette  r, type_recette tr, THEME_RECETTE th "
					+ "WHERE r.id_rec=? "
					+ "  AND tr.ID_TYPER = r.ID_TYPER "
					+ "  AND th.ID_THEME = r.ID_THEME");
			prepare.setInt(1, id);

			ResultSet result = prepare.executeQuery();
						
			while (result.next()) {
					
				int 	idRec = result.getInt("id_rec");
				String 	themeRec = result.getString("NOM_THEME");
				String 	typeRec = result.getString("NOM_TYPER");
				String 	nomRec = result.getString("NOM_REC");
				ListeDescriptionsRecette descRec = new ListeDescriptionsRecetteDAO(connect).find(idRec);
				String 	photoRec = result.getString("PHOTO_REC");
				String 	complementRec = result.getString("COMPLEMENT_REC");
				boolean selPoivre = (result.getInt("SEL_POIVRE") == 1 ) ?  true : false;
				ListeDenrees listeDenrees = new ListeDenreesDAO(connect).find(idRec);
				ListePreparations listePreparations = new ListePreparations();
				
				recette = new Recette(idRec, themeRec, typeRec, nomRec, descRec, selPoivre, photoRec, complementRec, listeDenrees, listePreparations);
				
			}			
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		} finally {

			if (prepare != null) prepare.close();
			
			if (this.connect != null) this.connect.close();

		}
		
		return recette;
	}
	


	


	
	

}
