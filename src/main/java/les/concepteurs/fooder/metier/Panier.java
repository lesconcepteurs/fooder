package les.concepteurs.fooder.metier;

import java.time.LocalDate;

public class Panier {
	
	private int idPanier;
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
	 * Settes Getters
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
