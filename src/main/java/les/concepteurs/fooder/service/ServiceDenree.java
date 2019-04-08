package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.implement.DenreeDAO;
import les.concepteurs.fooder.implement.IngredientDAO;
import les.concepteurs.fooder.implement.RecetteDAO;
import les.concepteurs.fooder.metier.Denree;

public class ServiceDenree implements IService<Denree, Integer> 
{

	private DenreeDAO denreeDAO;
	private IngredientDAO ingredientDAO;
	private RecetteDAO recetteDAO;


	/**
	 * constructeur qui instancie l'objet DAO
	 */
	public ServiceDenree() 
	{
		denreeDAO = new DenreeDAO();
		ingredientDAO = new IngredientDAO();
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
	public Denree findById(Integer idIng, Integer idRec, Integer idUnite) {
		getDenreeDAO().openSession();
		Denree denree = new Denree();
		denree.setIngredient(getIngredientDAO().findById(idIng));
		denree.setRecette(getRecetteDAO().findById(idRec));
		
		Denree denree = getDenreeDAO().findById(idIng, idRec, idUnite);
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

	public IngredientDAO getIngredientDAO() {
		return ingredientDAO;
	}

	public RecetteDAO getRecetteDAO() {
		return recetteDAO;
	}

	@Override
	public Denree findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


}
