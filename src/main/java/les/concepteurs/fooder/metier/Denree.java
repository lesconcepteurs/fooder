package les.concepteurs.fooder.metier;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// Obligation de nommer ici l'entité, sinon Exception levée si on veut récuperer les denrees avec le findAll() de DenreeDAO. 
//Exception : Exception in thread "main" java.lang.IllegalArgumentException: org.hibernate.hql.internal.ast.QuerySyntaxException: denree is not mapped [from denree]
@Entity(name="denree")
@Table(name="denree")
public class Denree implements Serializable {
	
	@Id
	@OneToOne(cascade= {CascadeType.DETACH,
						CascadeType.MERGE,
						CascadeType.PERSIST,
						CascadeType.REFRESH})
	@JoinColumn(name="ID_ING")
	private Ingredient ingredient;
	
	//Rajout d'une propriété Recette. Devient relation bidirectionnelle. 
	// Car une Denree doit pouvoir connaître sa Recette. Il y a bien un id_Rec dans la table de denree 
	//ManyToOne car il peut y avoir plusieurs denrees pour une recette
	// pas de suppression en cascade car quand on supprime une Denree, on ne veut pas supprimer la Recette associée
	@Id
	@ManyToOne(cascade= {CascadeType.DETACH,
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
		return "Denree [ingredient=" + ingredient + ", uniteMesure=" + uniteMesure 
				+ ", quantite=" + quantite + "]";
	}
	

}
