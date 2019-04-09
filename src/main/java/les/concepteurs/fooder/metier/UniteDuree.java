package les.concepteurs.fooder.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *  Classe metier pour les unites de duree
 * @author JM Tanoux
 */ 
@Entity(name="uniteDuree")
@Table(name="unite_duree")
public class UniteDuree {
	
    @Id
    @Column(name = "id_unite_duree")
	private int idUniteDuree;
    
    
    @Column(name = "nom_unite_duree")
		private String nomUniteDuree;
	
	/**
	 * Constructeur de UniteDuree
	 * @param idUniteDuree (int)
	 * @param nomUniteDuree (String)
	 */
	public UniteDuree(int idUniteDuree, String nomUniteDuree) {
		
		this.idUniteDuree = idUniteDuree;
		this.nomUniteDuree = nomUniteDuree;
		
	}
	
	public UniteDuree() {}
	
	
	/*
	 * Getters Setters
	 */

	public int getIdUniteDuree() {
		return idUniteDuree;
	}
	public String getNomUniteDuree() {
		return nomUniteDuree;
	}

	
	@Override
	public String toString() {
		return "UniteDuree [idUniteDuree=" + idUniteDuree + ", nomUniteDuree=" + nomUniteDuree + "]";
	}
	


}
