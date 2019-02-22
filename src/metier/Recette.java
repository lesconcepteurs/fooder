package metier;

public class Recette {
	
	private int idRec;
	private String nomRec;
	private String descRec;
	private short selPoivre;
	private String photoRec;
	private String complementRec;
	
	/**
	 * Constructeur de Recette
	 * @param idRec (int)
	 * @param nomRec (String)
	 * @param descRec (String)
	 * @param selPoivre (short)
	 * @param photoRec (String)
	 * @param complementRec (String)
	 */
	public Recette(int idRec, String nomRec, String descRec, short selPoivre, String photoRec, String complementRec) {
		
		this.idRec = idRec;
		this.nomRec = nomRec;
		this.descRec = descRec;
		this.selPoivre = selPoivre;
		this.photoRec = photoRec;
		this.complementRec = complementRec;
		
	}
	
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
	public short getSelPoivre() {
		return selPoivre;
	}
	public String getPhotoRec() {
		return photoRec;
	}
	public String getComplementRec() {
		return complementRec;
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
	private void setSelPoivre(short selPoivre) {
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
		return "Recette [idRec=" + idRec + ", nomRec=" + nomRec + ", descRec=" + descRec + ", selPoivre=" + selPoivre
				+ ", photoRec=" + photoRec + ", complementRec=" + complementRec + "]";
	}
	
	
}
		