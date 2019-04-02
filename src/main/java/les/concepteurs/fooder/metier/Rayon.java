package les.concepteurs.fooder.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="rayon")
@Table(name="rayon")
public class Rayon {
	
    @Id
    @Column(name = "id_rayon")
	private int idRayon;
    
    
    @Column(name = "nom")
	private String nomRayon;
	
	/**
	 * Constructeur de Rayon
	 * @param idRayon (int)
	 * @param nomRayon (String)
	 */
	public Rayon(int idRayon, String nomRayon) {
		
		this.idRayon = idRayon;
		this.nomRayon = nomRayon;
		
	}
	
	public Rayon() {}
	
	
	/*
	 * Getters Setters
	 */

	public int getIdRayon() {
		return idRayon;
	}
	public String getNomRayon() {
		return nomRayon;
	}

	@SuppressWarnings("unused")
	private void setIdRayon(int idRayon) {
		this.idRayon = idRayon;
	}
	@SuppressWarnings("unused")
	private void setNomRayon(String nomRayon) {
		this.nomRayon = nomRayon;
	}

	
	@Override
	public String toString() {
		return "Rayon [idRayon=" + idRayon + ", nomRayon=" + nomRayon + "]";
	}
	


}
