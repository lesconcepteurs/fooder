package les.concepteurs.fooder.implement;

import java.util.List;

import les.concepteurs.fooder.dao.DAOHibSessionTransaction;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.SePrepare;

/*
 * Classe de DAO pour Se prepare
 * Elle étend la classe DAOHibSessionTransaction qui permet d'ouvrir et fermer des sessions et transactions
 * Elle implémente l'interfaceDAOHibernate qui définit les methodes de CRUD d'Hibernate 
 * @author Jimmy
 *
 */
public class SePrepareDAO extends DAOHibSessionTransaction implements interfaceDAOHibernate<SePrepare, Integer> {

	public List<SePrepare> findByIdSePrepare(Integer idRec) {
		List<SePrepare> listeSePrepares = getSession().createQuery("from se_prepare where id_rec="+idRec).getResultList();	
		return listeSePrepares;
	}


	@Override
	public SePrepare findById(Integer id) {
			SePrepare sepreprare = getSession().get(SePrepare.class, id);
		return null;
	}

	@Override
	public List<SePrepare> findAll() {
		List<SePrepare> listeSePrepares = getSession().createQuery("from SePrepare").getResultList();		
		return listeSePrepares;
	}
}
