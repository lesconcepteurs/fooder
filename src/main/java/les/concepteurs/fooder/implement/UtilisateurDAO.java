package les.concepteurs.fooder.implement;

import java.util.List;

import les.concepteurs.fooder.dao.DAOHibSessionTransaction;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.Utilisateur;

public class UtilisateurDAO extends DAOHibSessionTransaction implements interfaceDAOHibernate<Utilisateur, Integer>{

	public UtilisateurDAO() {
		super();
	}
	
	/**
	 * CRUD
	 */
	@Override
	public Utilisateur findById(Integer id) {
		Utilisateur utilisateur = getSession().get(Utilisateur.class, id);
		return utilisateur;
	}

	@Override
	public List<Utilisateur> findAll() {
		List<Utilisateur> utilisateurs = (List<Utilisateur>)getSession().createQuery("from utilisateur").list();
		return utilisateurs;
	}

}
