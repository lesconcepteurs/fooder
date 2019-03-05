package les.concepteurs.fooder.metier;

public class Ingredient {
	
	private int idIng;
	private String nomIng;
	private String photoIng;
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
	 * Getters Setters
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
	private void setIdIng(int idIng) {
		this.idIng = idIng;
	}
	private void setNomIng(String nomIng) {
		this.nomIng = nomIng;
	}
	private void setPhotoIng(String photoIng) {
		this.photoIng = photoIng;
	}

	@Override
	public String toString() {
		return "Ingredient [idIng=" + idIng + ", nomIng=" + nomIng + ", photoIng=" + photoIng + ", rayon=" + rayon + "]";
	}	

}
