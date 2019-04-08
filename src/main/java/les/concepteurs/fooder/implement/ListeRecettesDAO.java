package les.concepteurs.fooder.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import les.concepteurs.fooder.dao.DAO;
import les.concepteurs.fooder.metier.ListeRecettes;
import les.concepteurs.fooder.metier.Recette;

public class ListeRecettesDAO extends DAO<ListeRecettes>{
	
	PreparedStatement prepare = null;

	public ListeRecettesDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(ListeRecettes obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ListeRecettes obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ListeRecettes obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ListeRecettes find(int id) throws SQLException {
		
		return null;
	}
	
	public ListeRecettes findAll() throws SQLException {
		
		ListeRecettes listeRecettes = new ListeRecettes();
				
		prepare = connect.prepareStatement("SELECT " + 
				"id_rec, " + 
				"nom_rec, " + 
				"sel_poivre, " + 
				"photo_rec, " + 
				"complement_rec, " + 
				"nom_theme, " + 
				"nom_typer " + 
				"FROM recette " + 
				"LEFT JOIN theme_recette ON recette.id_theme = theme_recette.id_theme " + 
				"LEFT JOIN type_recette ON recette.id_typer = type_recette.id_typer");
		
		ResultSet result = prepare.executeQuery();
		
		while (result.next()) {
			
			boolean isSelPoivre;
			int selPoivre = result.getInt("sel_poivre");
			
			if (selPoivre == 1) {
				isSelPoivre = true;
			}
			else {
				isSelPoivre = false;
			}
			
			/*
			Recette rec = new Recette(result.getInt("id_rec"), 
					result.getString("nom_theme"),
					result.getString("nom_typer"), 
					result.getString("nom_rec"), 
					new ListeDescriptionsRecetteDAO(connect).find(result.getInt("id_rec")), 
					isSelPoivre, 
					result.getString("photo_rec"), 
					result.getString("complement_rec"), 
					new ListeDenreesDAO(connect).find(result.getInt("id_rec")), 
					new ListePreparationsDAO(connect).find(result.getInt("id_rec")));
			
			listeRecettes.add(rec);*/
		}
			
		return listeRecettes;
				
	}

}
