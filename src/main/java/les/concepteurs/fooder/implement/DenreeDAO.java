package les.concepteurs.fooder.implement;

import java.util.List;

import les.concepteurs.fooder.dao.DAOHibSessionTransaction;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.Denree;

/**
 * Classe de DAO des denrees. 
 * Implemente les methodes de CRUD des objets Denree
 * Utilise des methodes Default de l'interfaceDAOHibernate 
 * 
 * @author stag05
 *
 */
public class DenreeDAO extends DAOHibSessionTransaction implements interfaceDAOHibernate<Denree, Integer> 
{

	@Override
	public Denree findById(Integer id) {
		
		Denree denree = getSession().get(Denree.class, id);
		
		return denree;
	}

	@Override
	public List<Denree> findAll() {
		
		List<Denree> listeDenrees = getSession().createQuery("from denree").getResultList();
		
		return listeDenrees;
	}

}
