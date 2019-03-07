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
	
	public Supermarche() {}
	
	/*
	 * Getters Setters 
	 */

	public int getIdSm() {
		return idSm;
	}
	public String getNomSm() {
		return nomSm;
	}

	public void setIdSm(int idSm) {
		this.idSm = idSm;
	}
	public void setNomSm(String nomSm) {
		this.nomSm = nomSm;
	}

	
	@Override
	public String toString() {
		return "Supermarche [idSm=" + idSm + ", nomSm=" + nomSm + "]";
	}
	
	
	
}
