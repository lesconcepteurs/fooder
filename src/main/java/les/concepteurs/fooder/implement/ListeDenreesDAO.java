package les.concepteurs.fooder.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import les.concepteurs.fooder.dao.DAO;
import les.concepteurs.fooder.metier.Denree;
import les.concepteurs.fooder.metier.Ingredient;
import les.concepteurs.fooder.metier.ListeDenrees;

public class ListeDenreesDAO extends DAO<ListeDenrees> {

	PreparedStatement prepare = null;

	public ListeDenreesDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(ListeDenrees obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ListeDenrees obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ListeDenrees obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ListeDenrees find(int id) throws SQLException {
		
		ListeDenrees listeDenrees = null;
		
try {
			
			prepare = connect.prepareStatement(
					"SELECT ID_ING, ID_UNITE, QUANTITE "
					+ "FROM DENREE  "
					+ "WHERE ID_REC = ?");
			prepare.setInt(1, id);
			
			ResultSet result = prepare.executeQuery();
			
			while (result.next()) {
				
				Denree denree = new Denree(Ingredient ingredient, String nomUniteMesure, int quantite);
				
				ListeDenrees.add(result.getString("TEXT_DESC"));
				
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (prepare != null) prepare.close();		
			if (this.connect != null) this.connect.close();
		}	

		return listeDenrees;
	}

}
