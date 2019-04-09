package les.concepteurs.fooder.metier;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="panier")
public class Panier {
	
	@Id
	@Column(name="id_panier")
	private int idPanier;
	
	@Column(name="date_panier")
	private LocalDate datePanier;
	
	/**
	 * Constructeur de Panier
	 * @param idPanier (int)
	 * @param datePanier (LocalDate)
	 */
	public Panier(int idPanier, LocalDate datePanier) {
		
		this.idPanier = idPanier;
		this.datePanier = datePanier;
		
	}
	
	public Panier(){}
	
	/*
	 * Setter and Getters
	 * */
	public int getIdPanier() {
		return idPanier;
	}
	public LocalDate getDatePanier() {
		return datePanier;
	}
	
	public void setIdPanier(int idPanier) {
		this.idPanier = idPanier;
	}
	public void setDatePanier(LocalDate datePanier) {
		this.datePanier = datePanier;
	}
	
	
	@Override
	public String toString() {
		return "Panier [idPanier=" + idPanier + ", datePanier=" + datePanier + "]";
	} 
				
}
