/**
 * ServiceRecette s'occupe des services concernant les recettes (Entre le controle Facade et la ListeRecettesDAO)
 */
package les.concepteurs.fooder.service;

import java.sql.SQLException;

import les.concepteurs.fooder.metier.ListeRecettes;
import les.concepteurs.fooder.dao.DAOConnect;
import les.concepteurs.fooder.implement.ListeRecettesDAO;

/**
 * @author Jimmy
 *
 */
public class ServiceRecette {

	public ServiceRecette() {
				
	}
	
	public ListeRecettes recupListeRecettes() {
		
		ListeRecettes listeRecettes = null;
		
		try {
			
			listeRecettes = new ListeRecettesDAO(DAOConnect.getConnexion()).findAll();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return listeRecettes;
	}
}