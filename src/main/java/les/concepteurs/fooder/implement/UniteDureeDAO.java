package les.concepteurs.fooder.implement;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import les.concepteurs.fooder.dao.HibernateUtil;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.UniteDuree;

/**
 *  Classe de DAO pour les unites de duree
 * @author JM Tanoux
 * @see https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-jpa-dao-example/
 */

public class UniteDureeDAO implements interfaceDAOHibernate<UniteDuree, Integer>{
	
	private Transaction transaction;;
    private Session session;
	
    
    public UniteDureeDAO() {
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
    
    @SuppressWarnings("unused")
	private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }
    
    public void closeSession() {
    	System.out.println("On UniteDuree Close");
    	this.session.close();
    }
    
    public void closeSessionTransaction() {
    	this.transaction.commit();
    	this.session.close();
    }
    
    
    
    /*
     * CRUD functions
     */
    
    public void persist(UniteDuree entity) {
        getSession().save(entity);
    }
 
    public void update(UniteDuree entity) {
        getSession().update(entity);
    }
    @Override
    public UniteDuree findById(Integer id) {
    	UniteDuree uniteDuree = (UniteDuree) getSession().get(UniteDuree.class, id);
        return uniteDuree; 
    }
    
    public UniteDuree find(int id) {
    	return findById(id);
    }
 
    public void delete(UniteDuree entity) {
        getSession().delete(entity);
    }
 
    @SuppressWarnings("unchecked")
    public List<UniteDuree> findAll() {
		List<UniteDuree> uniteDuree = (List<UniteDuree>) getSession().createQuery("from uniteDuree").list();
        return uniteDuree;
    }
 
    public void deleteAll() {
        List<UniteDuree> entityList = findAll();
        for (UniteDuree entity : entityList) {
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




