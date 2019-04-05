package les.concepteurs.fooder.dao;

import java.util.List;

import org.hibernate.Session;

/**
 * Classe DAO typee generique
 * 
 * @see https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-jpa-dao-example
 * @author Philippe Cohen
 * @param objet generique &lt;T&gt;,  Id
 */
public interface interfaceDAOHibernate<T, Id> {

	public T findById(Id id);

	public List<T> findAll();

	public default void persist(Session session, T entity) 
	{
		session.save(entity);
	}

	public default void update(Session session, T entity)
	{
		session.update(entity);
	}
	
	public default T find(Id id) 
	{
		return findById(id);
	}

	public default void delete(Session session, T entity)
	{
		session.delete(entity);
	}

	public default void deleteAll(Session session)
	{
		List<T> entityList = findAll();
        for (T entity : entityList) {
            session.delete(entity);
        }
	}

	
	/*
	public void persist(T entity);

	public void update(T entity);

	public T findById(Id entity);

	public void delete(T entity);

	public List<T> findAll();

	public void deleteAll();
	 */
	
}