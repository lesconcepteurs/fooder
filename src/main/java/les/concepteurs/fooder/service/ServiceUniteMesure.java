package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.implement.UniteMesureDAO;
import les.concepteurs.fooder.metier.UniteMesure;


public class ServiceUniteMesure implements IService<UniteMesure, Integer> 
{

	private UniteMesureDAO uniteMesureDAO;
	
	@Override
	public void persist(UniteMesure entity) {
		getUniteMesureDAO().openSessionTransaction();
		getUniteMesureDAO().persist(getUniteMesureDAO().getSession(), entity);
		getUniteMesureDAO().closeSessionTransaction();
		
	}

	@Override
	public void update(UniteMesure entity) {
		getUniteMesureDAO().openSessionTransaction();
		getUniteMesureDAO().update(getUniteMesureDAO().getSession(), entity);
		getUniteMesureDAO().closeSessionTransaction();
		
	}

	@Override
	public UniteMesure findById(Integer id) {
		getUniteMesureDAO().openSession();
		UniteMesure UniteMesure = getUniteMesureDAO().findById(id);
		getUniteMesureDAO().closeSession();
		return UniteMesure;
	}

	@Override
	public void delete(Integer id) {
		getUniteMesureDAO().openSessionTransaction();
		UniteMesure UniteMesure = getUniteMesureDAO().findById(id);
		getUniteMesureDAO().delete(getUniteMesureDAO().getSession(), UniteMesure);
		getUniteMesureDAO().closeSessionTransaction();		
		
	}

	@Override
	public List<UniteMesure> findAll() {
		getUniteMesureDAO().openSession();
		List<UniteMesure> listeUniteMesures = getUniteMesureDAO().findAll();
		getUniteMesureDAO().closeSession();
		return listeUniteMesures;
	}

	@Override
	public void deleteAll() {
		getUniteMesureDAO().openSessionTransaction();
		getUniteMesureDAO().deleteAll(getUniteMesureDAO().getSession());
		getUniteMesureDAO().closeSessionTransaction();		
	}

	public UniteMesureDAO getUniteMesureDAO() {
		return uniteMesureDAO;
	}


}
