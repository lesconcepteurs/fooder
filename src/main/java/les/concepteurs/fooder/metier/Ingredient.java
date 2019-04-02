package les.concepteurs.fooder.metier;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ingredient")
public class Ingredient {
	
	@Id
	@Column(name = "id_ing")
	private int idIng;
	
	@Column(name = "nom_ing")
	private String nomIng;
	
	@Column(name = "photo_ing")
	private String photoIng;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_rayon")
	private Rayon rayon;
	
	/**
	 * Constructeur Ingredient
	 * @param idIng (int)
	 * @param nomIng (String)
	 * @param photoIng (String)
	 * @param rayon (Rayon)
	 */
	public Ingredient(int idIng, String nomIng, String photoIng, Rayon rayon) {
		
		this.idIng = idIng;
		this.nomIng = nomIng;
		this.photoIng = photoIng;
		this.rayon = rayon;
		
	}
	
	public Ingredient() {}
	
	
	/*
	 * Getters then Setters
	 */
	public int getIdIng() {
		return idIng;
	}
	public String getNomIng() {
		return nomIng;
	}
	public String getPhotoIng() {
		return photoIng;
	}
	public Rayon getRayon() {
		return rayon;
	}
	
	public void setRayon(Rayon rayon) {
		this.rayon = rayon;
	}
	public void setIdIng(int idIng) {
		this.idIng = idIng;
	}
	public void setNomIng(String nomIng) {
		this.nomIng = nomIng;
	}
	public void setPhotoIng(String photoIng) {
		this.photoIng = photoIng;
	}

	@Override
	public String toString() {
		return "Ingredient [idIng=" + idIng + ", nomIng=" + nomIng + ", photoIng=" + photoIng + ", rayon=" + rayon + "]";
	}	
	

}
