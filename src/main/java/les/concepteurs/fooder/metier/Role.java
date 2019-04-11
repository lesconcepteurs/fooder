package les.concepteurs.fooder.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")

public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_role")
	private int idRole;
	
	@Column(name="nom_role")
	private String nomRole;
	
	/**
	 * Constructeur de Role
	 * @param nomRole (String)
	 */
	public Role(String nomRole) {
		
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
	
	private void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	private void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

	
	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", nomRole=" + nomRole + "]";
	}

}
