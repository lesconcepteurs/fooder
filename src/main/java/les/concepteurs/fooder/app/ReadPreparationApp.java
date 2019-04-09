package les.concepteurs.fooder.app;

import java.util.List;

import les.concepteurs.fooder.metier.Denree;
import les.concepteurs.fooder.metier.Ingredient;
import les.concepteurs.fooder.metier.Panier;
import les.concepteurs.fooder.metier.Recette;
import les.concepteurs.fooder.metier.TypePrepa;
import les.concepteurs.fooder.metier.UniteDuree;
import les.concepteurs.fooder.service.ServiceDenree;
import les.concepteurs.fooder.service.ServiceIngredient;
import les.concepteurs.fooder.service.ServicePanier;
import les.concepteurs.fooder.service.ServiceRecette;
import les.concepteurs.fooder.service.ServiceTypePrepa;
import les.concepteurs.fooder.service.ServiceUniteDuree;

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
		System.out.println("Type de la recette 1 : "+recette.getTypeRec().getNomTypeR());
			
		for (int i = 0 ; i < recette.getListeDenrees().size(); i++) {
			System.out.println("Liste de denrees de la recette : "+recette.getListeDenrees().get(i));
		}
				
		System.out.println("****************");
		System.out.println("****************");
		
		ServiceDenree serviceDenree = new ServiceDenree();
		List<Denree> listeDenrees = serviceDenree.findByIdRecette(1);
		
		for (int i = 0 ; i < listeDenrees.size() ; i++) {
			System.out.println("Denrée de la recette 1 : "+listeDenrees.get(i));
		}

		System.out.println("****************");
		System.out.println("****************");
		
		ServiceUniteDuree serviceUniteDuree = new ServiceUniteDuree();
		UniteDuree uniteDuree = serviceUniteDuree.findById(1);
		System.out.println(uniteDuree);
		System.out.println("Nom d'unite de duree : "+uniteDuree.getNomUniteDuree());
		
		System.out.println("****************");
		System.out.println("****************");
		
		ServiceTypePrepa serviceTypePrepa = new ServiceTypePrepa();
		TypePrepa typePrepa = serviceTypePrepa.findById(1);
		System.out.println(typePrepa);
		System.out.println("Nom du typePrepa :" + typePrepa.getNomTypePrepa());
		
		System.out.println("****************");
		System.out.println("****************");
		
		//tests de récupération de la date d'un panier avec son id
		ServicePanier servicePanier = new ServicePanier();
		Panier panier = servicePanier.findById(31);
		System.out.println(panier);
		System.out.println("Date du panier 31 : " + panier.getDatePanier());
		
		
		
	}

}
