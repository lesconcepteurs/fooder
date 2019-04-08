package les.concepteurs.fooder.implement;

import java.util.List;

import les.concepteurs.fooder.dao.DAOHibSessionTransaction;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.Description;

/**
 *  Classe de DAO pour les Descriptions
 * @author Philippe Cohen
 * @see https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-jpa-dao-example/
 */
public class DescriptionDAO extends DAOHibSessionTransaction implements interfaceDAOHibernate<Description, Integer>  {

	
    public DescriptionDAO() {
		super();
	}
  
    
    /*
     * CRUD functions
     */
    @Override
    public Description findById(Integer id) {
    	
    	Description Description = getSession().get(Description.class, id);
        return Description; 
    }
    
    @Override
    public List<Description> findAll() {
		@SuppressWarnings("unchecked")
		List<Description> Description = (List<Description>) getSession().createQuery("from Description").list();
        return Description;
    }     

}
