package metier;

public class TypeRecette {
	private int idTypeR;
	private String nomTypeR;
	
	/*
	 * Constructeur
	 * */
	public TypeRecette(int idTypeR, String nomTypeR) {
		super();
		this.idTypeR = idTypeR;
		this.nomTypeR = nomTypeR;
	}
	
	/*
	 * Setters Getters
	 **/
	public int getIdTypeR() {
		return idTypeR;
	}
	public String getNomTypeR() {
		return nomTypeR;
	}
	private void setIdTypeR(int idTypeR) {
		this.idTypeR = idTypeR;
	}
	private void setNomTypeR(String nomTypeR) {
		this.nomTypeR = nomTypeR;
	}

	@Override
	public String toString() {
		return "TypeRecette [idTypeR=" + idTypeR + ", nomTypeR=" + nomTypeR + "]";
	}
	
	

}
