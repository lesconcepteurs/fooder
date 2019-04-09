package les.concepteurs.fooder.service;

import java.util.List;
import les.concepteurs.fooder.implement.TypePrepaDAO;
import les.concepteurs.fooder.metier.Ingredient;
import les.concepteurs.fooder.metier.TypePrepa;

/**
 *  Classe dservice pour les unites de duree
 * @author JM Tanoux
 */


public class ServiceTypePrepa  implements IService<TypePrepa, Integer> {
	
	private TypePrepaDAO typePrepaDAO;

	public ServiceTypePrepa() {
		typePrepaDAO=new TypePrepaDAO();
	}

	@Override
	public void persist(TypePrepa entity) {
		  getTypePrepaDAO().openSessionTransaction();
	      getTypePrepaDAO().persist(getTypePrepaDAO().getSession(), entity);
	      getTypePrepaDAO().closeSessionTransaction();
	}

	@Override
	public void update(TypePrepa entity) {
		 getTypePrepaDAO().openSessionTransaction();
	     getTypePrepaDAO().persist(getTypePrepaDAO().getSession(), entity);
	     getTypePrepaDAO().closeSessionTransaction();		
	}

	@Override
	public TypePrepa findById(Integer id) {
		getTypePrepaDAO().openSession();
		TypePrepa typePrepa = getTypePrepaDAO().findById(id);
        getTypePrepaDAO().closeSession();
        return typePrepa;
	}

	@Override
	public void delete(Integer id) {
		getTypePrepaDAO().openSessionTransaction();
		TypePrepa typePrepa = getTypePrepaDAO().findById(id);
        getTypePrepaDAO().delete(getTypePrepaDAO().getSession(),typePrepa);
        getTypePrepaDAO().closeSessionTransaction();		
	}

	@Override
	public List<TypePrepa> findAll() {
		getTypePrepaDAO().openSession();
        List<TypePrepa> typePrepa = getTypePrepaDAO().findAll();
        getTypePrepaDAO().closeSession();
        return typePrepa;	
		
	}

	@Override
	public void deleteAll() {
		getTypePrepaDAO().openSessionTransaction();
		getTypePrepaDAO().deleteAll(getTypePrepaDAO().getSession());
		getTypePrepaDAO().closeSessionTransaction();
		
	}

	public TypePrepaDAO getTypePrepaDAO() {
		return typePrepaDAO;
	}

}
