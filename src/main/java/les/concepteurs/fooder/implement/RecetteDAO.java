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
										
			prepare = connect.prepareStatement(
					"SELECT DISTINCT r.id_rec, r.nom_rec, r.photo_rec, r.complement_rec, r.sel_poivre, tr.nom_typer, th.nom_theme "
					+ "FROM recette r "
					+ "LEFT JOIN type_recette tr  ON tr.id_typer = r.id_typer "
					+ "LEFT JOIN theme_recette th ON th.id_theme = r.id_theme "
					+ "WHERE r.id_rec=?");
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
				ListePreparations listePreparations = new ListePreparationsDAO(connect).find(idRec);
				
				recette = new Recette(idRec, themeRec, typeRec, nomRec, descRec, selPoivre, photoRec, complementRec, listeDenrees, listePreparations);				
				
			}			
			

		

		
		return recette;
	}
	


	


	
	

}
