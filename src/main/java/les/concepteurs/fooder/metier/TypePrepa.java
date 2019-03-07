package les.concepteurs.fooder.metier;

public class TypePrepa {
	
	private int idTypePrepa;
	private String nomTypePrepa;
	
	/**
	 * Constructeur de TypePrepa
	 * @param idTypePrepa (int)
	 * @param nomTypePrepa (String)
	 */
	public TypePrepa(int idTypePrepa, String nomTypePrepa) {
		this.idTypePrepa = idTypePrepa;
		this.nomTypePrepa = nomTypePrepa;
	}
	
	public TypePrepa() {}

	/*
	 * Getters Setters
	 */
	
	public int getIdTypePrepa() {
		return idTypePrepa;
	}
	public String getNomTypePrepa() {
		return nomTypePrepa;
	}

	public void setIdTypePrepa(int idTypePrepa) {
		this.idTypePrepa = idTypePrepa;
	}
	public void setNomTypePrepa(String nomTypePrepa) {
		this.nomTypePrepa = nomTypePrepa;
	}
	

	@Override
	public String toString() {
		return "typePrepa [idTypePrepa=" + idTypePrepa + ", nomTypePrepa=" + nomTypePrepa + "]";
	}

}
