/**
 * ServiceRecette s'occupe des services concernant les recettes (Entre le controle Facade et la ListeRecettesDAO)
 */
package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.metier.Recette;
import les.concepteurs.fooder.implement.RecetteDAOHib;

/**
 * @author Florian
 *
 */
public class ServiceRecette {

	private RecetteDAOHib recetteDAO;

	public ServiceRecette() {
		recetteDAO = new RecetteDAOHib();
	}
	
	/*
	 * Methodes
	 */
	public void persist(Recette entity) {
		getRecetteDao().openSessionTransaction();
		getRecetteDao().persist(getRecetteDao().getSession(), entity);
		getRecetteDao().closeSessionTransaction();
    }
 
    public void update(Recette entity) {
    	getRecetteDao().openSessionTransaction();
    	getRecetteDao().update(getRecetteDao().getSession(), entity);
    	getRecetteDao().closeSessionTransaction();
    }
 
    public Recette findById(Integer id) {
    	getRecetteDao().openSession();
        Recette recette = getRecetteDao().findById(id);
        getRecetteDao().closeSession();
        return recette;
    }
 
    public void delete(Integer id) {
    	getRecetteDao().openSessionTransaction();
        Recette recette = getRecetteDao().findById(id);
        getRecetteDao().delete(getRecetteDao().getSession(), recette);
        getRecetteDao().closeSessionTransaction();
    }
 
    public List<Recette> findAll() {
    	getRecetteDao().openSession();
        List<Recette> listeRecettes = getRecetteDao().findAll();
        getRecetteDao().closeSession();
        return listeRecettes;
    }
 
    public void deleteAll() {
    	getRecetteDao().openSessionTransaction();
    	getRecetteDao().deleteAll(getRecetteDao().getSession());
    	getRecetteDao().closeSessionTransaction();
    }
 
    public RecetteDAOHib getRecetteDao() {
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