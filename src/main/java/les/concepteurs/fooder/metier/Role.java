package les.concepteurs.fooder.metier;

public class Role {
	
	private int idRole;
	private String nomRole;
	
	/**
	 * Constructeur de Role
	 * @param idRole (int)
	 * @param nomRole (String)
	 */
	public Role(int idRole, String nomRole) {
		
		this.idRole = idRole;
		this.nomRole = nomRole;
		
	}
	
	public Role() {}
	
	/*
	 * Getters Setters
	 */

	public int getIdRole() {
		return idRole;
	}
	public String getNomRole() {
		return nomRole;
	}
	
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

	
	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", nomRole=" + nomRole + "]";
	}

}
