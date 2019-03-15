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
				"SELECT DISTINCT I.ID_ING, I.ID_RAYON, I.NOM_ING, I.PHOTO_ING, R.NOM "
				+ "FROM INGREDIENT I, RAYON R "
				+ "WHERE I.ID_ING = ? "
				+ "  AND R.ID_RAYON = I.ID_RAYON");
		prepare.setInt(1, id);

		ResultSet result = prepare.executeQuery();
					
		while (result.next()) {
				
			int 	idIng = result.getInt("ID_ING");
			String 	nomIng = result.getString("NOM_ING");
			String 	photoIng = result.getString("PHOTO_ING");
			String 	nomRayon = result.getString("NOM");
			
			ingredient = new Ingredient(idIng, nomIng, photoIng, nomRayon);
			
		}			
		
		prepare.close();

		return ingredient;
	}

}
