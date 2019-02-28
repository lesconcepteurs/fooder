package les.concepteurs.fooder.metier;

public class TypeRecette {
	
	private int idTypeR;
	private String nomTypeR;
	
	/**
	 * Constructeur de TypeRecette
	 * @param idTypeR (int)
	 * @param nomTypeR (String)
	 */
	public TypeRecette(int idTypeR, String nomTypeR) {

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
