package les.concepteurs.fooder.implement;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import les.concepteurs.fooder.dao.HibernateUtil;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.Ingredient;

/**
 *  Classe de DAO pour les ingredients
 * @author Philippe Cohen
 * @see https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-jpa-dao-example/
 */
public class IngredientDAO implements interfaceDAOHibernate<Ingredient, String>  {
	
	private Transaction transaction;;
    private Session session;
	
    
    public IngredientDAO() {
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
    	//this.session.close();
    	System.out.println("On Ingredient closed : ");
    }
    
    public void closeSessionTransaction() {
    	this.transaction.commit();
    	this.session.close();
    }
    
    
    
    /*
     * CRUD functions
     */
    
    public void persist(Ingredient entity) {
        getSession().save(entity);
    }
 
    public void update(Ingredient entity) {
        getSession().update(entity);
    }
 
    public Ingredient findById(String id) {
    	Ingredient ingredient = (Ingredient) getSession().get(Ingredient.class, Integer.parseInt(id));
        return ingredient; 
    }
    
    public Ingredient find(int id) {
    	return findById(Integer.toString(id));
    }
 
    public void delete(Ingredient entity) {
        getSession().delete(entity);
    }
 
    @SuppressWarnings("unchecked")
    public List<Ingredient> findAll() {
		List<Ingredient> ingredient = (List<Ingredient>) getSession().createQuery("from ingredient").list();
        return ingredient;
    }
 
    public void deleteAll() {
        List<Ingredient> entityList = findAll();
        for (Ingredient entity : entityList) {
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
