package les.concepteurs.fooder.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import les.concepteurs.fooder.dao.DAO;
import les.concepteurs.fooder.metier.Description;
import les.concepteurs.fooder.metier.ListeRecettes;
import les.concepteurs.fooder.metier.Recette;

public class ListeRecettesDAO extends DAO<ListeRecettes>{
	
	PreparedStatement prepare = null;
	
	private final String ID_REC = "id_rec";
	private final String NOM_THEME = "nom_theme";
	private final String NOM_TYPER = "nom_typer";
	private final String NOM_REC = "nom_rec";
	private final String PHOTO_REC = "photo_rec";
	private final String COMPL_REC = "complement_rec";
	

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
			
			listeRecettes.add(rec);
		}
			
		return listeRecettes;
				
	}
	
	public ListeRecettes findType(int idType) throws SQLException {
		
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
				"JOIN type_recette ON recette.id_typer = type_recette.id_typer " +
				"AND type_recette.id_typer = "+ idType				
				);	
				
		ResultSet result = prepare.executeQuery();
		
		while (result.next()) {
			
			//Externaliser dans une methode
			boolean isSelPoivre;
			int selPoivre = result.getInt("sel_poivre");
			
			if (selPoivre == 1) {
				isSelPoivre = true;
			}
			else {
				isSelPoivre = false;
			}
			
			// création d'un Bean Recette
			Recette recette = new Recette();
			
			int idRec = result.getInt(ID_REC);
			
			// Set du Bean
			recette.setIdRec(idRec);
			recette.setThemeRec(result.getString(NOM_THEME));
			recette.setTypeRec(result.getString(NOM_TYPER));
			recette.setNomRec(result.getString(NOM_REC));
			recette.setDescRec(new ListeDescriptionsRecetteDAO(connect).find(idRec));
			recette.setSelPoivre(isSelPoivre);
			recette.setPhotoRec(result.getString(PHOTO_REC));
			recette.setComplementRec(result.getString(COMPL_REC));
			recette.setDenrees(new ListeDenreesDAO(connect).find(idRec));			
			recette.setListePrepa(new ListePreparationsDAO(connect).find(idRec));
			
			// ajout du bean à la liste de recettes
			listeRecettes.add(recette);
			
		}
		
		return listeRecettes;
	}

}
