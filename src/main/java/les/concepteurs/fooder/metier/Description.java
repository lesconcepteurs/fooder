package les.concepteurs.fooder.metier;

public class Description {
	
	private int idDesc;
	private int idRec;
	private String textDesc;
	
	/**
	 * Constructeur de Recette simple
	 * @param idDesc (int)
	 * @param idRec (int)
	 * @param textDesc (String)
	 */
	public Description(int idDesc, int idRec, String textDesc) {

		this.idDesc = idDesc;
		this.idRec = idRec;
		this.textDesc = textDesc;
		
	}
	
	public Description() {}

	/*
	 * Accesseurs
	 */
	public int getIdDesc() {
		return idDesc;
	}
	public int getIdRec() {
		return idRec;
	}
	public String getTextDesc() {
		return textDesc;
	}
	public void setIdDesc(int idDesc) {
		this.idDesc = idDesc;
	}
	public void setIdRec(int idRec) {
		this.idRec = idRec;
	}
	public void setTextDesc(String textDesc) {
		this.textDesc = textDesc;
	}
	
	
	/*
	 * ToString
	 */
	
	@Override
	public String toString() {
		return "Description [idDesc=" + idDesc 
						+ ", idRec=" + idRec 
						+ ", textDesc=" + textDesc 
						+ ", getIdDesc()="+ getIdDesc() 
						+ ", getIdRec()=" + getIdRec() 
						+ ", getTextDesc()=" + getTextDesc() + "]";
	}


	

}
