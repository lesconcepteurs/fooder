package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.implement.DescriptionDAO;
import les.concepteurs.fooder.metier.Description;

public class ServiceDescription implements IService<Description, Integer>{
	
	private DescriptionDAO descriptionDAO;

	public ServiceDescription() {
		descriptionDAO = new DescriptionDAO();
	}
	
	/*
	 * Methodes
	 */
	@Override
	public void persist(Description entity) { 
        getDescriptionDao().openSessionTransaction();
        getDescriptionDao().persist(getDescriptionDao().getSession(), entity);
        getDescriptionDao().closeSessionTransaction();
    }
 
	@Override
    public void update(Description entity) {
    	getDescriptionDao().openSessionTransaction();
    	getDescriptionDao().update(getDescriptionDao().getSession(), entity);
    	getDescriptionDao().closeSessionTransaction();
    }
 
	@Override
    public Description findById(Integer id) {
    	getDescriptionDao().openSession();
        Description description = getDescriptionDao().findById(id);
        getDescriptionDao().closeSession();
        return description;
    }
 
	@Override
    public void delete(Integer id) {
    	getDescriptionDao().openSessionTransaction();
        Description description = getDescriptionDao().findById(id);
        getDescriptionDao().delete(getDescriptionDao().getSession(), description);
        getDescriptionDao().closeSessionTransaction();
    }
 
	@Override
    public List<Description> findAll() {
    	getDescriptionDao().openSession();
        List<Description> descriptions = getDescriptionDao().findAll();
//        getDescriptionDao().closeSession();
        return descriptions;
    }
	
//	public List<Description> findByIdRec(int id) {
//    	getDescriptionDao().openSession();
//        List<Description> descriptions = getDescriptionDao().findByIdRec(id);
////        getDescriptionDao().closeSession();
//        return descriptions;
//    }
 
	@Override
    public void deleteAll() {
    	getDescriptionDao().openSessionTransaction();
    	getDescriptionDao().deleteAll(getDescriptionDao().getSession());
    	getDescriptionDao().closeSessionTransaction();
    }
 
    public DescriptionDAO getDescriptionDao() {
        return descriptionDAO;
    }
	

}
