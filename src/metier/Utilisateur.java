package metier;

public class Utilisateur {
	
	private int idUtilisateur;
	private String emailUtilisateur;
	private String password;
	
	/**
	 * Constructeur d'Utilisateur
	 * @param idUtilisateur (int)
	 * @param emailUtilisateur (String)
	 * @param password (String)
	 */
	public Utilisateur(int idUtilisateur, String emailUtilisateur, String password) {
		
		this.idUtilisateur = idUtilisateur;
		this.emailUtilisateur = emailUtilisateur;
		this.password = password;
		
	}

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

	private void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	private void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}
	private void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", emailUtilisateur=" + emailUtilisateur + ", password="
				+ password + "]";
	}
				
}
