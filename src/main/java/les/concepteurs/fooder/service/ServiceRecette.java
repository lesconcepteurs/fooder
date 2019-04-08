/**
 * ServiceRecette s'occupe des services concernant les recettes (Entre le controle Facade et la ListeRecettesDAO)
 */
package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.metier.Recette;
import les.concepteurs.fooder.implement.RecetteDAO;

/**
 * Classe Service qui implémente les methodes de l'interface IService.
 * Ces methodes permettent de réaliser les operation de CRUD classique
 * @author Florian
 *
 */
public class ServiceRecette implements IService<Recette, Integer>{

	private RecetteDAO recetteDAO;

	public ServiceRecette() {
		recetteDAO = new RecetteDAO();
	}
	
	/*
	 * Methodes
	 */
	@Override
	public void persist(Recette entity) {
		getRecetteDao().openSessionTransaction();
		getRecetteDao().persist(getRecetteDao().getSession(), entity);
		getRecetteDao().closeSessionTransaction();
    }
 
	@Override
    public void update(Recette entity) {
    	getRecetteDao().openSessionTransaction();
    	getRecetteDao().update(getRecetteDao().getSession(), entity);
    	getRecetteDao().closeSessionTransaction();
    }

	@Override
    public Recette findById(Integer id) {
    	getRecetteDao().openSession();
        Recette recette = getRecetteDao().findById(id);
        getRecetteDao().closeSession();
        return recette;
    }

	@Override
    public void delete(Integer id) {
    	getRecetteDao().openSessionTransaction();
        Recette recette = getRecetteDao().findById(id);
        getRecetteDao().delete(getRecetteDao().getSession(), recette);
        getRecetteDao().closeSessionTransaction();
    }
 
	@Override
    public List<Recette> findAll() {
    	getRecetteDao().openSession();
        List<Recette> listeRecettes = getRecetteDao().findAll();
        getRecetteDao().closeSession();
        return listeRecettes;
    }

	@Override
    public void deleteAll() {
    	getRecetteDao().openSessionTransaction();
    	getRecetteDao().deleteAll(getRecetteDao().getSession());
    	getRecetteDao().closeSessionTransaction();
    }
 
    public RecetteDAO getRecetteDao() {
        return recetteDAO;
    }
	
	
//	public ServiceRecette() {
//				
//	}
//	
//	public ListeRecettes recupListeRecettes() {
//		
//		ListeRecettes listeRecettes = null;
//		
//		try {
//			
//			listeRecettes = new ListeRecettesDAO(DAOConnect.getConnexion()).findAll();
//		
//		} catch (SQLException e) {
//			
//			e.printStackTrace();
//		}
//		
//		//controle console
//		System.out.println("je suis bien dans ServiceRecettes");
//		
//		return listeRecettes;
//	}
}