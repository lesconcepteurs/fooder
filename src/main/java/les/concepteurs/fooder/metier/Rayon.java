package les.concepteurs.fooder.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name = "rayon")
public class Rayon {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rayon")
	private int idRayon;
    
    @Column(name = "nom_rayon")
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

	private void setIdRayon(int idRayon) {
		this.idRayon = idRayon;
	}
	private void setNomRayon(String nomRayon) {
		this.nomRayon = nomRayon;
	}

	
	@Override
	public String toString() {
		return "Rayon [idRayon=" + idRayon + ", nomRayon=" + nomRayon + "]";
	}
	


}
