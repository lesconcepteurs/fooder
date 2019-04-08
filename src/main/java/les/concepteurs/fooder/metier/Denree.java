package les.concepteurs.fooder.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="denree")
public class Denree {
	
	
	private Ingredient ingredient;
	private String NomUniteMesure;
	
	@Column(name="QUANTITE")
	private double quantite;
	
	
	/**
	 * @param ingredient
	 * @param nomUniteMesure
	 * @param quantite
	 */
	public Denree(Ingredient ingredient, String nomUniteMesure, int quantite) {

		this.ingredient = ingredient;
		this.NomUniteMesure = nomUniteMesure;
		this.quantite = quantite;
		
	}
	
	public Denree() {}
	
	/*
	 * Utilities
	 */

	public Ingredient getIngredient() {
		return ingredient;
	}

	public String getNomUniteMesure() {
		return NomUniteMesure;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public void setNomUniteMesure(String nomUniteMesure) {
		NomUniteMesure = nomUniteMesure;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Denree [ingredient=" + ingredient 
					+ ", NomUniteMesure=" + NomUniteMesure 
					+ ", quantite=" + quantite + "]";
	}
	
	
	

}
