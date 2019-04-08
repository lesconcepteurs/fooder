/**
 * ServiceRecette s'occupe des services concernant les recettes (Entre le controle Facade et la ListeRecettesDAO)
 */
package les.concepteurs.fooder.service;

import java.sql.SQLException;

import les.concepteurs.fooder.metier.ListeRecettes;
import les.concepteurs.fooder.metier.Recette;
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

		//controle console
		System.out.println("je suis bien dans ServiceRecettes");

		return listeRecettes;
	}

	public ListeRecettes recupListeRecettes(int idType) {

		ListeRecettes listeRecettes = null;

		try {

			listeRecettes = new ListeRecettesDAO(DAOConnect.getConnexion()).findType(idType);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		//controle
		System.out.println("je suis bien dans ServiceRecettes.recupListeRecettes(int id Type)");

		return listeRecettes;
	}

}