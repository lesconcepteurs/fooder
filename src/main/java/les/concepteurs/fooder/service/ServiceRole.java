package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.implement.RoleDAO;
import les.concepteurs.fooder.metier.Role;

public class ServiceRole implements IService<Role, Integer> {
	
	private static RoleDAO roleDAO;
	
	public ServiceRole() {
		roleDAO = new RoleDAO();
	}

	@Override
	public void persist(Role entity) {
		getRoleDAO().openSessionTransaction();
		getRoleDAO().persist(getRoleDAO().getSession(), entity);
		getRoleDAO().closeSessionTransaction();
	}

	@Override
	public void update(Role entity) {
		getRoleDAO().openSessionTransaction();
		getRoleDAO().update(getRoleDAO().getSession(), entity);
		getRoleDAO().closeSessionTransaction();
	}

	@Override
	public Role findById(Integer id) {
		getRoleDAO().openSession();
		Role role = getRoleDAO().findById(id);
		getRoleDAO().closeSession();
		return role;
	}

	@Override
	public void delete(Integer id) {
		getRoleDAO().openSessionTransaction();
		Role role = getRoleDAO().findById(id);
		getRoleDAO().delete(getRoleDAO().getSession(), role);
		getRoleDAO().closeSessionTransaction();	
	}

	@Override
	public List<Role> findAll() {
		getRoleDAO().openSession();
		List<Role> roles = getRoleDAO().findAll();
		getRoleDAO().closeSession();
		return roles;
	}

	@Override
	public void deleteAll() {
		getRoleDAO().openSessionTransaction();
		getRoleDAO().deleteAll(getRoleDAO().getSession());
		getRoleDAO().closeSessionTransaction();
		
	}
	
	public RoleDAO getRoleDAO() {
		return roleDAO;
	}

}
