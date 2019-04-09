package les.concepteurs.fooder.implement;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import les.concepteurs.fooder.dao.HibernateUtil;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.TypePrepa;

/**
 *  Classe de DAO pour lestypes de preparation
 * @author JM Tanoux
 * @see https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-jpa-dao-example/
 */

public class TypePrepaDAO  implements interfaceDAOHibernate<TypePrepa, Integer> {



	private Transaction transaction;;
    private Session session;
	
    
    public TypePrepaDAO() {
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
    	System.out.println("On TypePrepa Close");
    	this.session.close();
    }
    
    public void closeSessionTransaction() {
    	this.transaction.commit();
    	this.session.close();
    }
    
    
    
    /*
     * CRUD functions
     */
    
    public void persist(TypePrepa entity) {
        getSession().save(entity);
    }
 
    public void update(TypePrepa entity) {
        getSession().update(entity);
    }
    @Override
    public TypePrepa findById(Integer id) {
    	TypePrepa typePrepa = (TypePrepa) getSession().get(TypePrepa.class, id);
        return typePrepa; 
    }
    
    public TypePrepa find(int id) {
    	return findById(id);
    }
 
    public void delete(TypePrepa entity) {
        getSession().delete(entity);
    }
 
    @SuppressWarnings("unchecked")
    public List<TypePrepa> findAll() {
		List<TypePrepa> typePrepa = (List<TypePrepa>) getSession().createQuery("from TypePrepa").list();
        return typePrepa;
    }
 
    public void deleteAll() {
        List<TypePrepa> entityList = findAll();
        for (TypePrepa entity : entityList) {
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
