package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.implement.IngredientDAO;
import les.concepteurs.fooder.metier.Ingredient;

public class ServiceIngredient {
	
	private static IngredientDAO ingredientDAO;

	public ServiceIngredient() {
		ingredientDAO = new IngredientDAO();
	}
	
	/*
	 * Methodes
	 */
	public void persist(Ingredient entity) {
        ingredientDAO.openSessionTransaction();
        ingredientDAO.persist(entity);
        ingredientDAO.closeSessionTransaction();
    }
 
    public void update(Ingredient entity) {
        ingredientDAO.openSessionTransaction();
        ingredientDAO.update(entity);
        ingredientDAO.closeSessionTransaction();
    }
 
    public Ingredient findById(Integer id) {
        ingredientDAO.openSession();
        Ingredient ingredient = ingredientDAO.findById(id);
//      ingredientDAO.closeSession();
        return ingredient;
    }
 
    public void delete(Integer id) {
        ingredientDAO.openSessionTransaction();
        Ingredient ingredient = ingredientDAO.findById(id);
        ingredientDAO.delete(ingredient);
        ingredientDAO.closeSessionTransaction();
    }
 
    public List<Ingredient> findAll() {
        ingredientDAO.openSession();
        List<Ingredient> ingredients = ingredientDAO.findAll();
        ingredientDAO.closeSession();
        return ingredients;
    }
 
    public void deleteAll() {
        ingredientDAO.openSessionTransaction();
        ingredientDAO.deleteAll();
        ingredientDAO.closeSessionTransaction();
    }
 
    public IngredientDAO ingredientDao() {
        return ingredientDAO;
    }
	

}
