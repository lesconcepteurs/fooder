package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.implement.IngredientDAO;
import les.concepteurs.fooder.metier.Ingredient;

public class ServiceIngredient {
	
	private IngredientDAO ingredientDAO;

	public ServiceIngredient() {
		ingredientDAO = new IngredientDAO();
	}
	
	/*
	 * Methodes
	 */
	
	public void persist(Ingredient entity) {
        getIngredientDao().openSessionTransaction();
        getIngredientDao().persist(getIngredientDao().getSession(), entity);
        getIngredientDao().closeSessionTransaction();
    } 
 
    public void update(Ingredient entity) {
    	getIngredientDao().openSessionTransaction();
    	getIngredientDao().update(getIngredientDao().getSession(), entity);
    	getIngredientDao().closeSessionTransaction();
    }
 
    public Ingredient findById(Integer id) {
    	getIngredientDao().openSession();
        Ingredient ingredient = getIngredientDao().findById(id);
        getIngredientDao().closeSession();
        return ingredient;
    }
 
    public void delete(Integer id) {
    	getIngredientDao().openSessionTransaction();
        Ingredient ingredient = getIngredientDao().findById(id);
        getIngredientDao().delete(getIngredientDao().getSession(), ingredient);
        getIngredientDao().closeSessionTransaction();
    }
 
    public List<Ingredient> findAll() {
    	getIngredientDao().openSession();
        List<Ingredient> ingredients = getIngredientDao().findAll();
        getIngredientDao().closeSession();
        return ingredients;
    }
 
    public void deleteAll() {
    	getIngredientDao().openSessionTransaction();
    	getIngredientDao().deleteAll(getIngredientDao().getSession());
    	getIngredientDao().closeSessionTransaction();
    }
 
    public IngredientDAO getIngredientDao() {
        return ingredientDAO;
    }
	

}
