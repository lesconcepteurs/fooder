package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.implement.UtilisateurDAO;
import les.concepteurs.fooder.metier.Utilisateur;

public class ServiceUtilisateur implements IService<Utilisateur, Integer> {
	
	private UtilisateurDAO utilisateurDAO;
	
	public ServiceUtilisateur() {
		utilisateurDAO = new UtilisateurDAO();
	}

	@Override
	public void persist(Utilisateur entity) {
		getUtilisateurDao().openSessionTransaction();
		getUtilisateurDao().persist(getUtilisateurDao().getSession(), entity);
		getUtilisateurDao().closeSessionTransaction();
	}

	@Override
	public void update(Utilisateur entity) {
		getUtilisateurDao().openSessionTransaction();
		getUtilisateurDao().update(getUtilisateurDao().getSession(), entity);
		getUtilisateurDao().closeSessionTransaction();	
	}

	@Override
	public Utilisateur findById(Integer id) {
		getUtilisateurDao().openSession();
		Utilisateur utilisateur = getUtilisateurDao().findById(id);
		getUtilisateurDao().closeSession();
		return utilisateur;
	}

	@Override
	public void delete(Integer id) {
		getUtilisateurDao().openSessionTransaction();
		Utilisateur utilisateur = getUtilisateurDao().findById(id);
		getUtilisateurDao().delete(getUtilisateurDao().getSession(), utilisateur);
		getUtilisateurDao().closeSessionTransaction();	
	}

	@Override
	public List<Utilisateur> findAll() {
		getUtilisateurDao().openSession();
		List<Utilisateur> utilisateurs = getUtilisateurDao().findAll();
		getUtilisateurDao().closeSession();
		return utilisateurs;
	}

	@Override
	public void deleteAll() {
		getUtilisateurDao().openSessionTransaction();
		getUtilisateurDao().deleteAll(getUtilisateurDao().getSession());
		getUtilisateurDao().closeSessionTransaction();	
	}
	
	private UtilisateurDAO getUtilisateurDao() {
		return utilisateurDAO;
	}

}
