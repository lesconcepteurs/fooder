package les.concepteurs.fooder.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class DAOHibernate 
{
	private Transaction transaction;
    private Session session;
    
    /*
     * Session & transaction 
     */
    
    public void openSession() {
    	this.session = HibernateUtil.getSessionFactory().openSession();
	}
    
    public void openSessionTransaction() {
    	this.session = HibernateUtil.getSessionFactory().openSession();
    	this.transaction = session.beginTransaction();
//		return session;
    }
    
    @SuppressWarnings("unused")
	private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }
    
    public void closeSession() {
    	System.out.println("On Ingredient closed : ");
    	this.session.close();
    }
    
    public void closeSessionTransaction() {
    	this.transaction.commit();
    	this.session.close();
    }
    
    
    /*
     * Getters & Setters
     */
    
    public Transaction getTransaction() {
		return transaction;
	}
    public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
    	
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
}
