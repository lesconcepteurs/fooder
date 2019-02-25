package metier;

public class Recette {
	
	private int idRec;
	private int idTheme;
	private int typeRec;
	private String nomRec;
	private String descRec;
	private boolean selPoivre;
	private String photoRec;
	private String complementRec;
	
	/**
	 * Constructeur de Recette
	 * @param idRec (int)
	 * @param idTheme (int)
	 * @param typeRec (int)
	 * @param nomRec (String)
	 * @param descRec (String)
	 * @param selPoivre (short)
	 * @param photoRec (String)
	 * @param complementRec (String)
	 */
	public Recette(int idRec, int idTheme, int typeRec, String nomRec, String descRec, boolean selPoivre, String photoRec, String complementRec) {
		
		this.idRec = idRec;
		this.setIdTheme(idTheme);
		this.setTypeRec(typeRec);
		this.nomRec = nomRec;
		this.descRec = descRec;
		this.selPoivre = selPoivre;
		this.photoRec = photoRec;
		this.complementRec = complementRec;
		
	}
	
	/**
	 * Constructeur par defaut utilisé par la DAO
	 * @see dao/implement/RecetteDAO.java
	 */
	public Recette() {}
	
	
	/*
	 * Getters Setters
	 */

	public int getIdRec() {
		return idRec;
	}
	public String getNomRec() {
		return nomRec;
	}
	public String getDescRec() {
		return descRec;
	}
	public boolean getSelPoivre() {
		return selPoivre;
	}
	public String getPhotoRec() {
		return photoRec;
	}
	public String getComplementRec() {
		return complementRec;
	}
	public int getIdTheme() {
		return idTheme;
	}
	public int getTypeRec() {
		return typeRec;
	}
	
	private void setTypeRec(int typeRec) {
		this.typeRec = typeRec;
	}
	private void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}
	private void setIdRec(int idRec) {
		this.idRec = idRec;
	}
	private void setNomRec(String nomRec) {
		this.nomRec = nomRec;
	}
	private void setDescRec(String descRec) {
		this.descRec = descRec;
	}
	private void setSelPoivre(boolean selPoivre) {
		this.selPoivre = selPoivre;
	}
	private void setPhotoRec(String photoRec) {
		this.photoRec = photoRec;
	}
	private void setComplementRec(String complementRec) {
		this.complementRec = complementRec;
	}

	
	@Override
	public String toString() {
		return "Recette [idRec=" + idRec + ", "
					  + "idTheme=" + idTheme + ", "
					  + "typeRec=" + typeRec + ", "
					  + "nomRec=" + nomRec + ", "
					  + "descRec=" + descRec + ", "
					  + "selPoivre=" + selPoivre + ", "
					  + "photoRec=" + photoRec + ", "
					  + "complementRec=" + complementRec + "]";
	}

}
		