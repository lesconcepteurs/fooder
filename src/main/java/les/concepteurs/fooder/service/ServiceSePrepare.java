package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.implement.RecetteDAO;
import les.concepteurs.fooder.implement.SePrepareDAO;
import les.concepteurs.fooder.implement.TypePrepaDAO;
import les.concepteurs.fooder.implement.UniteDureeDAO;
import les.concepteurs.fooder.metier.SePrepare;

public class ServiceSePrepare implements IService<SePrepare, Integer> {
	
	/*
	 * 	private DenreeDAO denreeDAO;
	private IngredientDAO ingredientDAO;
	private RecetteDAO recetteDAO;
	private UniteMesureDAO uniteMesureDAO;
	 */
	
	private RecetteDAO recetteDAO;
	private SePrepareDAO seprepareDAO;
	private TypePrepaDAO typeprepaDAO;
	private UniteDureeDAO unitedureeDAO;
	
	private ServiceSePrepare() {
		recetteDAO = new RecetteDAO();
		seprepareDAO = new SePrepareDAO();
		typeprepaDAO = new TypePrepaDAO();
		unitedureeDAO = new UniteDureeDAO();
	}

	@Override
	public void persist(SePrepare entity) {
		getSeprepareDAO().openSessionTransaction();
		getSeprepareDAO().persist(getSeprepareDAO().getSession(), entity);
		getSeprepareDAO().closeSessionTransaction();	
		
	}

	@Override
	public void update(SePrepare entity) {
		getSeprepareDAO().openSessionTransaction();
		getSeprepareDAO().update(getSeprepareDAO().getSession(), entity);
		getSeprepareDAO().closeSessionTransaction();
		
	}

	@Override
	public SePrepare findById(Integer id) {
		getSeprepareDAO().openSession();
		SePrepare sePrepare = getSeprepareDAO().findById(id);
        getSeprepareDAO().closeSession();
        return sePrepare;
	}

	@Override
	public void delete(Integer id) {
		getSeprepareDAO().openSessionTransaction();
		SePrepare sePrepare = getSeprepareDAO().findById(id);
		getSeprepareDAO().delete(getSeprepareDAO().getSession(), sePrepare);
		getSeprepareDAO().closeSessionTransaction();	
		
	}

	@Override
	public List<SePrepare> findAll() {
		getSeprepareDAO().openSession();
		List<SePrepare> listeSePrepares = getSeprepareDAO().findAll();
		getSeprepareDAO().closeSession();
		return listeSePrepares;
	}

	@Override
	public void deleteAll() {
		getSeprepareDAO().openSessionTransaction();
		getSeprepareDAO().deleteAll(getSeprepareDAO().getSession());
		getSeprepareDAO().closeSessionTransaction();
		
	}

	/* Getter */
	public RecetteDAO getRecetteDAO() {
		return recetteDAO;
	}

	public SePrepareDAO getSeprepareDAO() {
		return seprepareDAO;
	}

	public TypePrepaDAO getTypeprepaDAO() {
		return typeprepaDAO;
	}

	public UniteDureeDAO getUnitedureeDAO() {
		return unitedureeDAO;
	}	
	
}
