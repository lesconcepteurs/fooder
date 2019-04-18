package les.concepteurs.fooder.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="utilisateurs")

public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_utilisateur")
	private int idUtilisateur;
	
	// Un role a plusieurs utilisateurs, la clé étrangère est du côté "plusieurs"
	@ManyToOne
	@JoinColumn(name="id_role")
	private Role role;
	
	
	@Column(name="email_utilisateur")
	private String emailUtilisateur;
	
	@Column(name="password")
	private String password;
	
	/**
	 * Constructeur d'Utilisateur
	 * @param role (Role)
	 * @param emailUtilisateur (String)
	 * @param password (String)
	 */
	public Utilisateur(String emailUtilisateur, String password, Role role) {
		
		this.emailUtilisateur = emailUtilisateur;
		this.password = password;
		this.role = role;
		
	}
	
	public Utilisateur() {}

	/*
	 * Getters Setters
	 */
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}
	public String getPassword() {
		return password;
	}
	public Role getRole() {
		return role;
	}

	private void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	private void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}
	private void setPassword(String password) {
		this.password = password;
	}
	private void setRole(Role role) {
		this.role = role;
	}
	

	
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", emailUtilisateur=" + emailUtilisateur + ", password="
				+ password + " Role= " + role +"]";
	}
				
}
