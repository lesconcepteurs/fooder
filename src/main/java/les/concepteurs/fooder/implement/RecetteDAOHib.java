package les.concepteurs.fooder.implement;

import java.util.List;

import les.concepteurs.fooder.dao.DAOHibSessionTransaction;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.Recette;

/**
 * Classe de DAO pour les recettes
 * Elle étend la classe DAOHibSessionTransaction qui permet d'ouvrir et fermer des sessions et transactions
 * Elle implémente l'interfaceDAOHibernate qui définit les methodes de CRUD d'Hibernate 
 * @author Florian
 *
 */
public class RecetteDAOHib extends DAOHibSessionTransaction implements interfaceDAOHibernate<Recette, Integer> {

	
	
	@Override
	public Recette findById(Integer id) {
		
		Recette recette = getSession().get(Recette.class, id);
		
		return recette;
	}

	@Override
	public List<Recette> findAll() {
		
		List<Recette> listeRecettes = getSession().createQuery("from recette").getResultList();
		
		return listeRecettes;
	}

}
