package les.concepteurs.fooder.app;

import les.concepteurs.fooder.metier.Ingredient;
import les.concepteurs.fooder.metier.Recette;
import les.concepteurs.fooder.service.ServiceIngredient;
import les.concepteurs.fooder.service.ServiceRecette;

public class ReadPreparationApp {

	public static void main(String[] args) {
		
		ServiceIngredient serviceIngredient = new ServiceIngredient();
		Ingredient ingredient = serviceIngredient.findById(1);
		System.out.println(ingredient);
		System.out.println("Nom du rayon :" + ingredient.getRayon().getNomRayon());

		System.out.println("****************");
		System.out.println("****************");
		
		ServiceRecette serviceRecette = new ServiceRecette();
		Recette recette = serviceRecette.findById(1);
		System.out.println(recette);
		System.out.println("Nom du type de recette : "+recette.getTypeRec().getNomTypeR());
		
	}

}
