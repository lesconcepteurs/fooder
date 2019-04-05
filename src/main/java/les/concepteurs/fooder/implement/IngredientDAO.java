package les.concepteurs.fooder.implement;

import java.util.List;

import les.concepteurs.fooder.dao.DAOHibSessionTransaction;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.Ingredient;

/**
 *  Classe de DAO pour les ingredients
 * @author Philippe Cohen
 * @see https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-jpa-dao-example/
 */
public class IngredientDAO extends DAOHibSessionTransaction implements interfaceDAOHibernate<Ingredient, Integer>  {

	
    public IngredientDAO() {
		super();
	}
  
    
    /*
     * CRUD functions
     */
    
    public Ingredient findById(Integer id) {
    	
    	Ingredient ingredient = getSession().get(Ingredient.class, id);
        return ingredient; 
    }
    
    @SuppressWarnings("unchecked")
    public List<Ingredient> findAll() {
		List<Ingredient> ingredient = (List<Ingredient>) getSession().createQuery("from ingredient").list();
        return ingredient;
    }
    
//    
//    public void persist(Ingredient entity) {
//        getSession().save(entity);
//    }
// 
//    public void update(Ingredient entity) {
//        getSession().update(entity);
//    }
//     
//    public Ingredient find(Integer id) {
//    	return findById(id);
//    } 
//    public void delete(Ingredient entity) {
//        getSession().delete(entity);
//    }
//    public void deleteAll() {
//        List<Ingredient> entityList = findAll();
//        for (Ingredient entity : entityList) {
//            delete(entity);
//        }
//    }
    
    

}
