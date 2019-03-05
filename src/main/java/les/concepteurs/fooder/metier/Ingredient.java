package les.concepteurs.fooder.metier;

public class Ingredient {
	
	private int idIng;
	private String nomIng;
	private String photoIng;
	private String nomRayon;
	
	/**
	 * Constructeur Ingredient
	 * @param idIng (int)
	 * @param nomIng (String)
	 * @param photoIng (String)
	 * @param nomRayon (String)
	 */
	public Ingredient(int idIng, String nomIng, String photoIng, String nomRayon) {
		
		this.idIng = idIng;
		this.nomIng = nomIng;
		this.photoIng = photoIng;
		this.nomRayon = nomRayon;
		
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
	public String getNomRayon() {
		return nomRayon;
	}
	public void setNomRayon(String nomRayon) {
		this.nomRayon = nomRayon;
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
		return "Ingredient [idIng=" + idIng + ", nomIng=" + nomIng + ", photoIng=" + photoIng + ", rayon=" + nomRayon + "]";
	}	

}
