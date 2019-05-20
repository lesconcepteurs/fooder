package les.concepteurs.fooder.metier;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="panier")
public class Panier {
	
	@Id
	@Column(name="id_panier")
	private int idPanier;
	
	/*Un panier a un seul utilisateur et vice et versa,
	 * id_utilisateur est clé étrangère dans la table panier*/
	@OneToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;
	
	@Column(name="date_panier")
	private LocalDate datePanier;
	
	/**
	 * Constructeur de Panier
	 * @param utilisateur
	 * @param datePanier (LocalDate)
	 */
	public Panier(Utilisateur utilisateur, LocalDate datePanier) {
		this.utilisateur = utilisateur;
		this.datePanier = datePanier;
		
	}
	
	public Panier(){}
	
	/*
	 * Setter and Getters
	 * */
	public int getIdPanier() {
		return idPanier;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public LocalDate getDatePanier() {
		return datePanier;
	}
	
	public void setIdPanier(int idPanier) {
		this.idPanier = idPanier;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public void setDatePanier(LocalDate datePanier) {
		this.datePanier = datePanier;
	}
	
	
	@Override
	public String toString() {
		return "Panier [idPanier=" + idPanier + ", utilisateur= "+ utilisateur +" datePanier=" + datePanier + "]";
	} 
				
}
