package metier;

public class Rayon {
	private int idRayon;
	private String nomRayon;
	
	/*
	 * Constructeur
	 */
	public Rayon(int idRayon, String nomRayon) {
		this.idRayon = idRayon;
		this.nomRayon = nomRayon;
	}
	/*
	 * Getters Setters
	 */

	public int getIdRayon() {
		return idRayon;
	}

	public String getNomRayon() {
		return nomRayon;
	}

	private void setIdRayon(int idRayon) {
		this.idRayon = idRayon;
	}

	private void setNomRayon(String nomRayon) {
		this.nomRayon = nomRayon;
	}

	@Override
	public String toString() {
		return "Rayon [idRayon=" + idRayon + ", nomRayon=" + nomRayon + "]";
	}
	


}
