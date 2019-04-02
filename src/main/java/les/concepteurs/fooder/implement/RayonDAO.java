package les.concepteurs.fooder.implement;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import les.concepteurs.fooder.dao.HibernateUtil;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.Rayon;

/**
 *  Classe de DAO pour les rayons
 * @author Philippe Cohen
 * @see https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-jpa-dao-example/
 */
public class RayonDAO implements interfaceDAOHibernate<Rayon, String>  {
	
	private Transaction transaction;;
    private Session session;
	
    
    public RayonDAO() {
		super();
	}
    
    /*
     * Session & transaction 
     */
    
    public Session openSession() {
    	this.session = HibernateUtil.getSessionFactory().openSession();
		return session;
    }
    
    public Session openSessionTransaction() {
    	this.session = HibernateUtil.getSessionFactory().openSession();
    	this.transaction = session.beginTransaction();
		return session;
    }
    
    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }
    
    public void closeSession() {
    	System.out.println("On Rayon Close");
    	this.session.close();
    }
    
    public void closeSessionTransaction() {
    	this.transaction.commit();
    	this.session.close();
    }
    
    
    
    /*
     * CRUD functions
     */
    
    public void persist(Rayon entity) {
        getSession().save(entity);
    }
 
    public void update(Rayon entity) {
        getSession().update(entity);
    }
 
    public Rayon findById(String id) {
    	Rayon rayon = (Rayon) getSession().get(Rayon.class, Integer.parseInt(id));
        return rayon; 
    }
    
    public Rayon find(int id) {
    	return findById(Integer.toString(id));
    }
 
    public void delete(Rayon entity) {
        getSession().delete(entity);
    }
 
    @SuppressWarnings("unchecked")
    public List<Rayon> findAll() {
		List<Rayon> rayon = (List<Rayon>) getSession().createQuery("from rayon").list();
        return rayon;
    }
 
    public void deleteAll() {
        List<Rayon> entityList = findAll();
        for (Rayon entity : entityList) {
            delete(entity);
        }
    }
    
    
    /*
     * Getters & Setters
     */
    
    public Transaction getTransaction() {
		return transaction;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
    public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
    
}
