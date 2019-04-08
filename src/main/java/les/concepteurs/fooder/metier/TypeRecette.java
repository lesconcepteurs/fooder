package les.concepteurs.fooder.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="type_recette")
public class TypeRecette {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TYPER")
	private int idTypeR;
	
	@Column(name="NOM_TYPER")
	private String nomTypeR;
	
	/**
	 * Constructeur de TypeRecette
	 * @param idTypeR (int)
	 * @param nomTypeR (String)
	 */
	public TypeRecette(int idTypeR, String nomTypeR) {

		this.idTypeR = idTypeR;
		this.nomTypeR = nomTypeR;
		
	}
	
	public TypeRecette() {}
	
	/*
	 * Setters Getters
	 **/
	
	public int getIdTypeR() {
		return idTypeR;
	}
	public String getNomTypeR() {
		return nomTypeR;
	}
	
	public void setIdTypeR(int idTypeR) {
		this.idTypeR = idTypeR;
	}
	public void setNomTypeR(String nomTypeR) {
		this.nomTypeR = nomTypeR;
	}

	
	@Override
	public String toString() {
		return "TypeRecette [idTypeR=" + idTypeR + ", nomTypeR=" + nomTypeR + "]";
	}
	
	

}
