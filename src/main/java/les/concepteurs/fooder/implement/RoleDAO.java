package les.concepteurs.fooder.implement;

import java.util.List;


import les.concepteurs.fooder.dao.DAOHibSessionTransaction;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.Role;



/**
 * classe DAO pour la classe role (rôle d'un utilisateur)
 * @author Olivier Gouiran
 *
 */

public class RoleDAO extends DAOHibSessionTransaction implements interfaceDAOHibernate<Role, Integer> {

	public RoleDAO() {
		super();
	}
	
	/**
	 * Recherche d'un rôle par son id
	 */
	@Override
	public Role findById(Integer id) {
		Role role = getSession().get(Role.class, id);
		return role;
	}

	/**
	 * Récupère une liste de tous les roles
	 */
	@Override
	public List<Role> findAll() {
		List<Role> role = (List<Role>)getSession().createQuery("from role").list();
		return role;
	}

}
