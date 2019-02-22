package metier;

public class typePrepa {
	private int idTypePrepa;
	private String nomTypePrepa;
	
	/*
	 * Constructeur
	 */
	
	public typePrepa(int idTypePrepa, String nomTypePrepa) {
		this.idTypePrepa = idTypePrepa;
		this.nomTypePrepa = nomTypePrepa;
	}

	/*
	 * Getters Setters
	 */
	
	public int getIdTypePrepa() {
		return idTypePrepa;
	}

	public String getNomTypePrepa() {
		return nomTypePrepa;
	}

	private void setIdTypePrepa(int idTypePrepa) {
		this.idTypePrepa = idTypePrepa;
	}

	private void setNomTypePrepa(String nomTypePrepa) {
		this.nomTypePrepa = nomTypePrepa;
	}
	

	@Override
	public String toString() {
		return "typePrepa [idTypePrepa=" + idTypePrepa + ", nomTypePrepa=" + nomTypePrepa + "]";
	}

}
