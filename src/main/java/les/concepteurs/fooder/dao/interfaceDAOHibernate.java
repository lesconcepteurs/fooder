package les.concepteurs.fooder.dao;

import java.util.List;

/**
 * Classe DAO typee generique
 * 
 * @see https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-jpa-dao-example
 * @author Philippe Cohen
 * @param objet generique &lt;T&gt;,  Id
 */
public interface interfaceDAOHibernate<T, Id> {

	public void persist(T entity);

	public void update(T entity);

	public T findById(Id entity);

	public void delete(T entity);

	public List<T> findAll();

	public void deleteAll();

}