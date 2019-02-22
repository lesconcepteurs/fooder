package metier;

public class Ingredient {
	
	private int idIng;
	private String nomIng;
	private String photoIng;
	
	/**
	 * Constructeur Ingredient
	 * @param idIng (int)
	 * @param nomIng (String)
	 * @param photoIng (String)
	 */
	public Ingredient(int idIng, String nomIng, String photoIng) {
		
		this.idIng = idIng;
		this.nomIng = nomIng;
		this.photoIng = photoIng;
		
	}
	
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
		return "Ingredient [idIng=" + idIng + ", nomIng=" + nomIng + ", photoIng=" + photoIng + "]";
	}
	

}
