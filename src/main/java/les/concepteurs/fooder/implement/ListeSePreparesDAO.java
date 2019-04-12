package les.concepteurs.fooder.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import les.concepteurs.fooder.dao.DAO;
import les.concepteurs.fooder.metier.ListeDenrees;
import les.concepteurs.fooder.metier.ListeSePrepares;

public class ListeSePreparesDAO extends DAO<ListeSePrepares>{

	PreparedStatement prepare = null;
	
	public ListeSePreparesDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(ListeSePrepares obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ListeSePrepares obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ListeSePrepares obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ListeSePrepares find(int id) throws SQLException {
		
		ListeSePrepares listeSePrepares = new ListeSePrepares();
		/*
		 * Test de la requete SQL pour ID_REC = 2
		 * SELECT DISTINCT SP.ID_REC, SP.ID_TYPE_PREPA , SP.DUREE, 
		 * UD.ID_UNITE_DUREE, SP.DUREE_SECOND FROM SE_PREPARE SP, UNITE_DUREE UD 
		 * WHERE ID_REC = 2 AND SP.ID_UNITE_DUREE = UD.ID_UNITE_DUREE
		 */
		prepare = connect.prepareStatement("SELECT" + 
				"DISTINCT SP.ID_REC, SP.ID_TYPE_PREPA , SP.DUREE, UD.ID_UNITE_DUREE, SP.DUREE_SECOND "
				+ "FROM SE_PREPARE SP, UNITE_DUREE UD "
				+ "WHERE ID_REC = ?"
				+ "AND SP.ID_UNITE_DUREE = UD.ID_UNITE_DUREE");
		prepare.setInt(1, id);
		
		ResultSet result = prepare.executeQuery();
		
		prepare.close();	
		
		return listeSePrepares;
	}

}
