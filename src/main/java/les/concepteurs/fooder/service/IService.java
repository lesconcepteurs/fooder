package les.concepteurs.fooder.service;

import java.util.List;


/**
 * Interface des classes Service.
 * @author stag05
 *
 */
public interface IService<T, Id> 
{
	public void persist(T entity);
	
	public void update(T entity);
	
	public T findById(Id id);
	
	public void delete(Id id); 
	
	public List<T> findAll();
	
	public void deleteAll();
	
}
