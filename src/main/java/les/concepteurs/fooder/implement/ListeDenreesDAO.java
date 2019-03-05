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
					"SELECT DISTINCT D.ID_ING, D.QUANTITE , UM.NOM_UNITE "
					+ "FROM DENREE D, UNITE_MESURE UM "
					+ "WHERE ID_REC = ?"
					+ "  AND UM.ID_UNITE = D.ID_UNITE");
			prepare.setInt(1, id);
			
			ResultSet result = prepare.executeQuery();
			
			while (result.next()) {
				
				Denree denree = new Denree(new Ingredient(), result.getString("NOM_UNITE"), result.getInt("QUANTITE"));
				
				listeDenrees.add(denree);
				
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
