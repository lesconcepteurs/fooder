package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.implement.RayonDAO;
import les.concepteurs.fooder.metier.Rayon;

public class ServiceRayon {
	
	private static RayonDAO rayonDAO;

	public ServiceRayon() {
		rayonDAO = new RayonDAO();
	}
	
	/*
	 * Methodes
	 */
	public void persist(Rayon entity) {
        rayonDAO.openSessionTransaction();
        rayonDAO.persist(entity);
        rayonDAO.closeSessionTransaction();
    }
 
    public void update(Rayon entity) {
        rayonDAO.openSessionTransaction();
        rayonDAO.update(entity);
        rayonDAO.closeSessionTransaction();
    }
 
    public Rayon findById(String id) {
        rayonDAO.openSession();
        Rayon rayon = rayonDAO.findById(id);
        rayonDAO.closeSession();
        return rayon;
    }
 
    public void delete(String id) {
        rayonDAO.openSessionTransaction();
        Rayon rayon = rayonDAO.findById(id);
        rayonDAO.delete(rayon);
        rayonDAO.closeSessionTransaction();
    }
 
    public List<Rayon> findAll() {
        rayonDAO.openSession();
        List<Rayon> rayons = rayonDAO.findAll();
        rayonDAO.closeSession();
        return rayons;
    }
 
    public void deleteAll() {
        rayonDAO.openSessionTransaction();
        rayonDAO.deleteAll();
        rayonDAO.closeSessionTransaction();
    }
 
    public RayonDAO rayonDao() {
        return rayonDAO;
    }
	

}
