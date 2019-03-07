package les.concepteurs.fooder.metier;

public class UniteMesure {
	
	private int idMesure;
	private String nomMesure;
	
	/**
	 * Constructeur d'UniteMesure
	 * @param idMesure (int)
	 * @param nomMesure (String)
	 */
	public UniteMesure(int idMesure, String nomMesure) {
		
		this.idMesure = idMesure;
		this.nomMesure = nomMesure;
		
	}
	
	public UniteMesure() {}
	
	/*
	 * Getters Setters
	 */

	public int getIdMesure() {
		return idMesure;
	}
	public String getNomMesure() {
		return nomMesure;
	}

	public void setIdMesure(int idMesure) {
		this.idMesure = idMesure;
	}
	public void setNomMesure(String nomMesure) {
		this.nomMesure = nomMesure;
	}

	
	@Override
	public String toString() {
		return "UniteMesure [idMesure=" + idMesure + ", nomMesure=" + nomMesure + "]";
	}
	
}
