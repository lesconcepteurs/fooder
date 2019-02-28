package les.concepteurs.fooder.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import les.concepteurs.fooder.dao.DAO;
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
								
			prepare = connect.prepareStatement("select * from recette where id_rec=?");
			prepare.setInt(1, id);

			ResultSet result = prepare.executeQuery();
						
			while (result.next()) {
					
				int 	idRec = result.getInt("id_rec");
				int 	idTheme = result.getInt("ID_THEME");
				int 	typeRec = result.getInt("ID_TYPER");
				String 	nomRec = result.getString("NOM_REC");
				String 	descRec = result.getString("DESC_REC");
				String 	photoRec = result.getString("PHOTO_REC");
				String 	complementRec = result.getString("COMPLEMENT_REC");
				boolean selPoivre = (result.getInt("SEL_POIVRE") == 1 ) ?  true : false;

				recette = new Recette(idRec, idTheme, typeRec, nomRec, descRec, selPoivre, photoRec, complementRec);
				
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
