package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.implement.PanierDAO;
import les.concepteurs.fooder.metier.Panier;

public class ServicePanier implements IService<Panier, Integer>{
	
	private PanierDAO panierDAO;
	
	public ServicePanier() {
		panierDAO = new PanierDAO();
	}
	
	private PanierDAO getPanierDAO() {
		return panierDAO;
	}

	/**
	 * insère un panier en base
	 */
	@Override
	public void persist(Panier entity) {
		getPanierDAO().openSessionTransaction();
        getPanierDAO().persist(getPanierDAO().getSession(), entity);
        getPanierDAO().closeSessionTransaction();
	}

	/**
	 * Modifie un panier en base
	 */
	@Override
	public void update(Panier entity) {
		getPanierDAO().openSessionTransaction();
		getPanierDAO().update(getPanierDAO().getSession(), entity);
		getPanierDAO().closeSessionTransaction();
	}

	/**
	 * Rerouve un panier via son id
	 */
	@Override
	public Panier findById(Integer id) {
		getPanierDAO().openSession();
        Panier panier = getPanierDAO().findById(id);
        getPanierDAO().closeSession();
		return panier;
	}

	/**
	 * Supprime un panier en base via son id
	 */
	@Override
	public void delete(Integer id) {
		getPanierDAO().openSessionTransaction();
		Panier panier = getPanierDAO().findById(id);
		getPanierDAO().delete(getPanierDAO().getSession(), panier);
		getPanierDAO().closeSessionTransaction();
	}

	/**
	 * Récupère une liste de tous les paniers
	 */
	@Override
	public List<Panier> findAll() {
		getPanierDAO().openSession();
		List<Panier> paniers = getPanierDAO().findAll();
		getPanierDAO().closeSession();
		return paniers;
	}

	/**
	 * Supprime tous le paniers de la base
	 */
	@Override
	public void deleteAll() {
		getPanierDAO().closeSessionTransaction();
		getPanierDAO().deleteAll(getPanierDAO().getSession());
		getPanierDAO().closeSessionTransaction();	
	}
	
	

}
