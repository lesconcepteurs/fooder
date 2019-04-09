package les.concepteurs.fooder.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DESCRIPTION_RECETTE")
public class Description {
	
	@Id
	@Column(name="ID_DESC")
	private int idDesc;
	
	@Column(name="ID_REC")
	private int idRec;
	
	@Column(name="TEXT_DESC")
	private String textDesc;
	
	/**
	 * Constructeur de Recette simple
	 * @param idDesc (int)
	 * @param idRec (int)
	 * @param textDesc (String)
	 */
	public Description(int idDesc, int idRec, String textDesc) {

		this.idDesc = idDesc;
		this.idRec = idRec;
		this.textDesc = textDesc;
		
	}
	
	public Description() {}

	/*
	 * Accesseurs
	 */
	public int getIdDesc() {
		return idDesc;
	}
	public int getIdRec() {
		return idRec;
	}
	public String getTextDesc() {
		return textDesc;
	}
	public void setIdDesc(int idDesc) {
		this.idDesc = idDesc;
	}
	public void setIdRec(int idRec) {
		this.idRec = idRec;
	}
	public void setTextDesc(String textDesc) {
		this.textDesc = textDesc;
	}
	
	
	/*
	 * ToString
	 */
	
	@Override
	public String toString() {
		return "Description [idDesc=" + idDesc 
						+ ", idRec=" + idRec 
						+ ", textDesc=" + textDesc + "]";
	}


	

}
