package les.concepteurs.fooder.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *  Classe metier pour les types de preparation
 * @author JM Tanoux
 */

@Entity(name="typePrepa")
@Table(name="type_prepa")
public class TypePrepa {
	
    @Id
    @Column(name = "id_type_prepa")
	private int idTypePrepa;
    
    
    @Column(name = "nom_type_prepa")
		private String nomTypePrepa;
	
	/**
	 * Constructeur de TypePrepa
	 * @param idTypePrepa (int)
	 * @param nomTypePrepa (String)
	 */
	public TypePrepa(int idTypePrepa, String nomTypePrepa) {
		
		this.idTypePrepa = idTypePrepa;
		this.nomTypePrepa = nomTypePrepa;
		
	}
	
	public TypePrepa() {}
	
	
	/*
	 * Getters Setters
	 */

	public int getIdTypePrepa() {
		return idTypePrepa;
	}
	public String getNomTypePrepa() {
		return nomTypePrepa;
	}

	@SuppressWarnings("unused")
	private void setIdTypePrepa(int idTypePrepa) {
		this.idTypePrepa = idTypePrepa ;
	}
	@SuppressWarnings("unused")
	private void setNomTypePrepa(String nomTypePrepa) {
		this.nomTypePrepa = nomTypePrepa;
	}

	
	@Override
	public String toString() {
		return "TypePrepa [idTypePrepa=" + idTypePrepa + ", nomTypePrepa=" + nomTypePrepa + "]";
	}
	


}
