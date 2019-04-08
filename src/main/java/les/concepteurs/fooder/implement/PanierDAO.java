package les.concepteurs.fooder.implement;

import java.util.List;

import les.concepteurs.fooder.dao.DAOHibSessionTransaction;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.Panier;

/**
 * Classe DAO pour la classe Panier
 * @author Olivier Gouiran
 *
 */

public class PanierDAO extends DAOHibSessionTransaction implements interfaceDAOHibernate<Panier, Integer>{

	public PanierDAO() {
		super();
	}
	
	/**
	 * Récupère un panier par son id
	 */
	@Override
	public Panier findById(Integer id) {
		Panier panier = getSession().get(Panier.class, id);
		return panier;
	}

	/**
	 * Récupère une liste de tous les paniers
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Panier> findAll() {
		List<Panier> paniers = (List<Panier>) getSession().createQuery("from panier").list();
		return paniers;
	}

}
