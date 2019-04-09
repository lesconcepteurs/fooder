package les.concepteurs.fooder.service;

import java.util.List;
import les.concepteurs.fooder.implement.UniteDureeDAO;
import les.concepteurs.fooder.metier.UniteDuree;

/**
 *  Classe service pour les unites de duree
 * @author JM Tanoux
 */
public class ServiceUniteDuree  implements IService<UniteDuree, Integer>{

	private UniteDureeDAO uniteDureeDAO;

	public ServiceUniteDuree() {
		uniteDureeDAO=new UniteDureeDAO();
	}

	@Override
	public void persist(UniteDuree entity) {
		  getUniteDureeDAO().openSessionTransaction();
	      getUniteDureeDAO().persist(getUniteDureeDAO().getSession(), entity);
	      getUniteDureeDAO().closeSessionTransaction();
	}

	@Override
	public void update(UniteDuree entity) {
		 getUniteDureeDAO().openSessionTransaction();
	     getUniteDureeDAO().persist(getUniteDureeDAO().getSession(), entity);
	     getUniteDureeDAO().closeSessionTransaction();		
	}

	@Override
	public UniteDuree findById(Integer id) {
		getUniteDureeDAO().openSession();
		UniteDuree uniteDuree = getUniteDureeDAO().findById(id);
        getUniteDureeDAO().closeSession();
        return uniteDuree;
	}

	@Override
	public void delete(Integer id) {
		getUniteDureeDAO().openSessionTransaction();
		UniteDuree uniteDuree = getUniteDureeDAO().findById(id);
        getUniteDureeDAO().delete(getUniteDureeDAO().getSession(),uniteDuree);
        getUniteDureeDAO().closeSessionTransaction();		
	}

	@Override
	public List<UniteDuree> findAll() {
		getUniteDureeDAO().openSession();
        List<UniteDuree> uniteDuree = getUniteDureeDAO().findAll();
        getUniteDureeDAO().closeSession();
        return uniteDuree;	
		
	}

	@Override
	public void deleteAll() {
		getUniteDureeDAO().openSessionTransaction();
		getUniteDureeDAO().deleteAll(getUniteDureeDAO().getSession());
		getUniteDureeDAO().closeSessionTransaction();
		
	}

	public UniteDureeDAO getUniteDureeDAO() {
		return uniteDureeDAO;
	}



}
