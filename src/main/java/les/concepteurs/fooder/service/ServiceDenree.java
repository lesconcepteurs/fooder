package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.implement.DenreeDAO;
import les.concepteurs.fooder.metier.Denree;

public class ServiceDenree implements IService<Denree, Integer> 
{

	private DenreeDAO denreeDAO;

	/**
	 * constructeur qui instancie l'objet DAO
	 */
	public ServiceDenree() 
	{
		denreeDAO = new DenreeDAO();
	}
	

	/*
	 * Methodes de l'interface IService à redéfinir 
	 */
	
	@Override
	public void persist(Denree entity) {
		getDenreeDAO().openSessionTransaction();
		getDenreeDAO().persist(getDenreeDAO().getSession(), entity);
		getDenreeDAO().closeSessionTransaction();		
	}

	@Override
	public void update(Denree entity) {
		getDenreeDAO().openSessionTransaction();
		getDenreeDAO().update(getDenreeDAO().getSession(), entity);
		getDenreeDAO().closeSessionTransaction();
	}

	@Override
	public Denree findById(Integer id) {
		getDenreeDAO().openSession();
		Denree denree = getDenreeDAO().findById(id);
		getDenreeDAO().closeSession();
		return denree;
	}

	@Override
	public void delete(Integer id) {
		getDenreeDAO().openSessionTransaction();
		Denree denree = getDenreeDAO().findById(id);
		getDenreeDAO().delete(getDenreeDAO().getSession(), denree);
		getDenreeDAO().closeSessionTransaction();		
	}

	@Override
	public List<Denree> findAll() {
		getDenreeDAO().openSession();
		List<Denree> listeDenrees = getDenreeDAO().findAll();
		getDenreeDAO().closeSession();
		return listeDenrees;
	}

	@Override
	public void deleteAll() {
		getDenreeDAO().openSessionTransaction();
		getDenreeDAO().deleteAll(getDenreeDAO().getSession());
		getDenreeDAO().closeSessionTransaction();
	}
	
	
	public DenreeDAO getDenreeDAO() {
		return denreeDAO;
	}

}
