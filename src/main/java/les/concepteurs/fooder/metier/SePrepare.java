package les.concepteurs.fooder.metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="se_prepare")
public class SePrepare implements Serializable{
	
	//OneToMany car pour une Recette on a plusieurs Preparation
	//cascade sans REMOVE car on ne veut pas appliquer la cascade pour tous.
	@Id
	@ManyToOne(cascade= {CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name = "ID_REC")
	private Recette recette;
	
	@Id
	@ManyToOne(cascade= {CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name = "ID_TYPE_PREPA")
	private TypePrepa typePrepa;
	
	@Column(name = "DUREE")
	private int duree;
	
	@OneToOne(cascade= {CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="ID_UNITE_DUREE")
	private UniteDuree uniteDuree;
	
	@Column(name = "DUREE_SECOND")
	private int duree_second;

	public SePrepare(Recette recette, TypePrepa typePrepa, int duree, UniteDuree uniteDuree, int duree_second) {

		this.recette = recette;
		this.typePrepa = typePrepa;
		this.duree = duree;
		this.uniteDuree = uniteDuree;
		this.duree_second = duree_second;
	}	

	public SePrepare() {}

	
	/*
	 * Getters Setters
	 */

	private Recette getRecette() {
		return recette;
	}

	private TypePrepa getTypePrepa() {
		return typePrepa;
	}

	private int getDuree() {
		return duree;
	}

	private UniteDuree getUniteDuree() {
		return uniteDuree;
	}

	private int getDuree_second() {
		return duree_second;
	}

	@SuppressWarnings("unused")
	private void setRecette(Recette recette) {
		this.recette = recette;
	}

	@SuppressWarnings("unused")
	private void setTypePrepa(TypePrepa typePrepa) {
		this.typePrepa = typePrepa;
	}

	@SuppressWarnings("unused")
	private void setDuree(int duree) {
		this.duree = duree;
	}
	
	@SuppressWarnings("unused")
	private void setUniteDuree(UniteDuree uniteDuree) {
		this.uniteDuree = uniteDuree;
	}

	@SuppressWarnings("unused")
	private void setDuree_second(int duree_second) {
		this.duree_second = duree_second;
	}

	@Override
	public String toString() {
		return "SePrepare [recette=" + recette + ", typePrepa=" + typePrepa + ", duree=" + duree
				+ ", uniteDuree=" + uniteDuree + ", duree_second=" + duree_second + "]";
	}
	
	
}
