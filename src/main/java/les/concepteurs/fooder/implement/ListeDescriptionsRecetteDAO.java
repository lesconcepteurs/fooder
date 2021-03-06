package les.concepteurs.fooder.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import les.concepteurs.fooder.dao.DAO;
import les.concepteurs.fooder.metier.Description;
import les.concepteurs.fooder.metier.ListeDescriptionsRecette;

public class ListeDescriptionsRecetteDAO extends DAO<ListeDescriptionsRecette> {

	PreparedStatement prepare = null;
	ListeDescriptionsRecette listeDescriptionsRecette = null;
	
	public ListeDescriptionsRecetteDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(ListeDescriptionsRecette obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ListeDescriptionsRecette obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ListeDescriptionsRecette obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ListeDescriptionsRecette find(int id) throws SQLException {
		
	listeDescriptionsRecette = new ListeDescriptionsRecette();
		
		prepare = connect.prepareStatement(
				"select ID_DESC, ID_REC, TEXT_DESC "
				+ "from DESCRIPTION_RECETTE "
				+ "where ID_REC = ?");
		prepare.setInt(1, id);
		
		ResultSet result = prepare.executeQuery();
		
		while (result.next()) {
			
			Description desc = new Description(result.getInt("ID_DESC"), result.getInt("ID_REC"), result.getString("TEXT_DESC"));
							
			listeDescriptionsRecette.add(desc);
			
		}			

		prepare.close();
		
		return listeDescriptionsRecette;
	}

}
