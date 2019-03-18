package les.concepteurs.fooder.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import les.concepteurs.fooder.dao.DAO;
import les.concepteurs.fooder.metier.Ingredient;

public class IngredientDAO extends DAO<Ingredient>  {
	
	PreparedStatement prepare = null;

	public IngredientDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Ingredient obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Ingredient obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Ingredient obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ingredient find(int id) throws SQLException {

		Ingredient ingredient = null;
								
		prepare = connect.prepareStatement(
				"SELECT DISTINCT i.id_ing, i.id_rayon, i.nom_ing, i.photo_ing, r.nom_rayon "
				+ "FROM ingredient i, rayon r "
				+ "WHERE i.id_ing = ? "
				+ "  AND r.id_rayon = i.id_rayon");
		prepare.setInt(1, id);

		ResultSet result = prepare.executeQuery();
					
		while (result.next()) {
				
			int 	idIng = result.getInt("id_ing");
			String 	nomIng = result.getString("nom_ing");
			String 	photoIng = result.getString("photo_ing");
			String 	nomRayon = result.getString("nom_rayon");
			
			ingredient = new Ingredient(idIng, nomIng, photoIng, nomRayon);
			
		}			
		
		prepare.close();

		return ingredient;
	}

}
