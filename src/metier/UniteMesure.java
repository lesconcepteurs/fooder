package metier;

public class UniteMesure {
	private int idMesure;
	private String nomMesure;
	
	/*
	 * Constructeur
	 */
	public UniteMesure(int idMesure, String nomMesure) {
		this.idMesure = idMesure;
		this.nomMesure = nomMesure;
	}
	/*
	 * Getters Setters
	 */

	public int getIdMesure() {
		return idMesure;
	}

	public String getNomMesure() {
		return nomMesure;
	}

	private void setIdMesure(int idMesure) {
		this.idMesure = idMesure;
	}

	private void setNomMesure(String nomMesure) {
		this.nomMesure = nomMesure;
	}

	@Override
	public String toString() {
		return "UniteMesure [idMesure=" + idMesure + ", nomMesure=" + nomMesure + "]";
	}
	
}
