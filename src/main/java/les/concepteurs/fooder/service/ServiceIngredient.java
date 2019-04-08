package les.concepteurs.fooder.service;

import java.util.List;

import les.concepteurs.fooder.implement.IngredientDAO;
import les.concepteurs.fooder.metier.Ingredient;

public class ServiceIngredient implements IService<Ingredient, Integer>{
	
	private IngredientDAO ingredientDAO;

	public ServiceIngredient() {
		ingredientDAO = new IngredientDAO();
	}
	
	/*
	 * Methodes
	 */
	@Override
	public void persist(Ingredient entity) {
        getIngredientDao().openSessionTransaction();
        getIngredientDao().persist(getIngredientDao().getSession(), entity);
        getIngredientDao().closeSessionTransaction();
    }
 
	@Override
    public void update(Ingredient entity) {
    	getIngredientDao().openSessionTransaction();
    	getIngredientDao().update(getIngredientDao().getSession(), entity);
    	getIngredientDao().closeSessionTransaction();
    }
 
	@Override
    public Ingredient findById(Integer id) {
    	getIngredientDao().openSession();
        Ingredient ingredient = getIngredientDao().findById(id);
        getIngredientDao().closeSession();
        return ingredient;
    }
 
	@Override
    public void delete(Integer id) {
    	getIngredientDao().openSessionTransaction();
        Ingredient ingredient = getIngredientDao().findById(id);
        getIngredientDao().delete(getIngredientDao().getSession(), ingredient);
        getIngredientDao().closeSessionTransaction();
    }
 
	@Override
    public List<Ingredient> findAll() {
    	getIngredientDao().openSession();
        List<Ingredient> ingredients = getIngredientDao().findAll();
        getIngredientDao().closeSession();
        return ingredients;
    }
 
	@Override
    public void deleteAll() {
    	getIngredientDao().openSessionTransaction();
    	getIngredientDao().deleteAll(getIngredientDao().getSession());
    	getIngredientDao().closeSessionTransaction();
    }
 
    public IngredientDAO getIngredientDao() {
        return ingredientDAO;
    }
	

}
