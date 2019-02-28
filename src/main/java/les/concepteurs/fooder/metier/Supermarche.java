package les.concepteurs.fooder.metier;

public class Supermarche {
	private int idSm;
	private String nomSm;
	
	/**
	 * Constructeur de Supermarche
	 * @param idSm (int)
	 * @param nomSm (String)
	 */
	public Supermarche(int idSm, String nomSm) {
		
		this.idSm = idSm;
		this.nomSm = nomSm;
		
	}
	
	/*
	 * Getters Setters 
	 */

	public int getIdSm() {
		return idSm;
	}
	public String getNomSm() {
		return nomSm;
	}

	private void setIdSm(int idSm) {
		this.idSm = idSm;
	}
	private void setNomSm(String nomSm) {
		this.nomSm = nomSm;
	}

	
	@Override
	public String toString() {
		return "Supermarche [idSm=" + idSm + ", nomSm=" + nomSm + "]";
	}
	
	
	
}
