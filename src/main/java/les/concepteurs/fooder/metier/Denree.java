package les.concepteurs.fooder.metier;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="denree")
public class Denree implements Serializable {
	
	@Id
	@OneToOne(cascade= {CascadeType.DETACH,
						CascadeType.MERGE,
						CascadeType.PERSIST,
						CascadeType.REFRESH})
	@JoinColumn(name="ID_ING")
	private Ingredient ingredient;
	
	@Id
	@OneToOne(cascade= {CascadeType.DETACH,
						CascadeType.MERGE,
						CascadeType.PERSIST,
						CascadeType.REFRESH})
	@JoinColumn(name="ID_REC")
	private Recette recette;
	
	@Id
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
	public Denree(Ingredient ingredient, Recette recette, UniteMesure uniteMesure, int quantite) {

		this.ingredient = ingredient;
		this.recette = recette;
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
	
	public Recette getRecette() {
		return recette;
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
	
	public void setRecette(Recette recette) {
		this.recette = recette;
	}

	@Override
	public String toString() {
		return "Denree [ingredient=" + ingredient + ", uniteMesure=" + uniteMesure + ", recette=" + recette
				+ ", quantite=" + quantite + "]";
	}
	

}
