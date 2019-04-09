package les.concepteurs.fooder.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="unite_mesure")
public class UniteMesure {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_UNITE")
	private int idMesure;
	
	@Column(name="NOM_UNITE")
	private String nomMesure;
	
	/**
	 * Constructeur d'UniteMesure
	 * @param idMesure (int)
	 * @param nomMesure (String)
	 */
	public UniteMesure(int idMesure, String nomMesure) {
		
		this.idMesure = idMesure;
		this.nomMesure = nomMesure;
		
	}
	
	public UniteMesure() {}
	
	/*
	 * Getters Setters
	 */

	public int getIdMesure() {
		return idMesure;
	}
	public String getNomMesure() {
		return nomMesure;
	}

	public void setIdMesure(int idMesure) {
		this.idMesure = idMesure;
	}
	public void setNomMesure(String nomMesure) {
		this.nomMesure = nomMesure;
	}

	
	@Override
	public String toString() {
		return "UniteMesure [idMesure=" + idMesure + ", nomMesure=" + nomMesure + "]";
	}
	
}
