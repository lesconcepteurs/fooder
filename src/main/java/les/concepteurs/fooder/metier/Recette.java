package les.concepteurs.fooder.metier;

public class Recette {
	
	private int idRec;
	private String themeRec;
	private String typeRec;
	private String nomRec;
	private ListeDescriptionsRecette descRec;
	private boolean selPoivre;
	private String photoRec;
	private String complementRec;
	private ListeDenrees denrees;
	private ListePreparations listePrepa;

	
	/**
	 * @param idRec (int)
	 * @param themeRec (String)
	 * @param typeRec (String)
	 * @param nomRec (String)
	 * @param descRec (ListeDescRec)
	 * @param selPoivre (boolean)
	 * @param photoRec (String)
	 * @param complementRec (String)
	 * @param denrees (ListeDenrees)
	 */
	public Recette(
			int idRec, 
			String themeRec, 
			String typeRec, 
			String nomRec, 
			ListeDescriptionsRecette descRec,
			boolean selPoivre, 
			String photoRec, 
			String complementRec, 
			ListeDenrees denrees,
			ListePreparations listePrepa) {

		this.idRec = idRec;
		this.themeRec = themeRec;
		this.typeRec = typeRec;
		this.nomRec = nomRec;
		this.descRec = descRec;
		this.selPoivre = selPoivre;
		this.photoRec = photoRec;
		this.complementRec = complementRec;
		this.denrees = denrees;
		this.listePrepa = listePrepa;
		
	}
	
	/**
	 * Default Constructor
	 */
	public Recette() {}
	
	
	/*
	 * Utilities
	 */

	public int getIdRec() {
		return idRec;
	}

	public String getThemeRec() {
		return themeRec;
	}

	public String getTypeRec() {
		return typeRec;
	}

	public String getNomRec() {
		return nomRec;
	}

	public ListeDescriptionsRecette getDescRec() {
		return descRec;
	}

	public boolean isSelPoivre() {
		return selPoivre;
	}

	public String getPhotoRec() {
		return photoRec;
	}

	public String getComplementRec() {
		return complementRec;
	}

	public ListeDenrees getDenrees() {
		return denrees;
	}

	public ListePreparations getListePrepa() {
		return listePrepa;
	}

	public void setIdRec(int idRec) {
		this.idRec = idRec;
	}

	public void setThemeRec(String themeRec) {
		this.themeRec = themeRec;
	}

	public void setTypeRec(String typeRec) {
		this.typeRec = typeRec;
	}

	public void setNomRec(String nomRec) {
		this.nomRec = nomRec;
	}

	public void setDescRec(ListeDescriptionsRecette descRec) {
		this.descRec = descRec;
	}

	public void setSelPoivre(boolean selPoivre) {
		this.selPoivre = selPoivre;
	}

	public void setPhotoRec(String photoRec) {
		this.photoRec = photoRec;
	}

	public void setComplementRec(String complementRec) {
		this.complementRec = complementRec;
	}

	public void setDenrees(ListeDenrees denrees) {
		this.denrees = denrees;
	}

	public void setListePrepa(ListePreparations listePrepa) {
		this.listePrepa = listePrepa;
	}

	@Override
	public String toString() {
		return "Recette [idRec=" + idRec + ", themeRec=" + themeRec + ", typeRec=" + typeRec + ", nomRec=" + nomRec
				+ ", descRec=" + descRec + ", selPoivre=" + selPoivre + ", photoRec=" + photoRec + ", complementRec="
				+ complementRec + ", denrees=" + denrees + ", listePrepa=" + listePrepa + "]";
	}

	
	

}
		