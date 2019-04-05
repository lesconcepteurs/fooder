package les.concepteurs.fooder.app;

import les.concepteurs.fooder.metier.Ingredient;
import les.concepteurs.fooder.service.ServiceIngredient;

public class ReadPreparationApp {

	public static void main(String[] args) {
		
		ServiceIngredient serviceIngredient = new ServiceIngredient();
		Ingredient ingredient = serviceIngredient.findById(1);
		System.out.println(ingredient);
		System.out.println("Nom du rayon :" + ingredient.getRayon().getNomRayon());

	}

}
