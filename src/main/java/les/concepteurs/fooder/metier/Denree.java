package les.concepteurs.fooder.metier;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="denree")
public class Denree {
	
	@OneToOne(cascade= {CascadeType.DETACH,
						CascadeType.MERGE,
						CascadeType.PERSIST,
						CascadeType.REFRESH})
	@JoinColumn(name="ID_ING")
	private Ingredient ingredient;
	
	@OneToOne(cascade= {CascadeType.DETACH,
						CascadeType.MERGE,
						CascadeType.PERSIST,
						CascadeType.REFRESH})
	@JoinColumn(name="ID_UNITE")
	private UniteMesure uniteMesure;
	
	@Column(name="QUANTITE")
	private double quantite;
	
	
	/**
	 * @param ingredient
	 * @param uniteMesure
	 * @param quantite
	 */
	public Denree(Ingredient ingredient, UniteMesure uniteMesure, int quantite) {

		this.ingredient = ingredient;
		this.uniteMesure = uniteMesure;
		this.quantite = quantite;
		
	}
	
	public Denree() {}
	
	/*
	 * Utilities
	 */

	public Ingredient getIngredient() {
		return ingredient;
	}

	public UniteMesure getUniteMesure() {
		return uniteMesure;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public void setUniteMesure(UniteMesure uniteMesure) {
		this.uniteMesure = uniteMesure;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Denree [ingredient=" + ingredient + ", uniteMesure=" + uniteMesure + ", quantite=" + quantite + "]";
	}
	

}
