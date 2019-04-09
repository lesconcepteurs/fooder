package les.concepteurs.fooder.metier;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="SE_PREPARE")
@Table(name="SE_PREPARE")
public class SePrepare implements Serializable{
	
	//OneToMany car pour une Recette on a plusieurs Preparation
	//cascade sans REMOVE car on ne veut pas appliquer la cascade pour tous.
	@Id
	@OneToMany(cascade= {CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name = "ID_REC")
	private Recette recette;
	
	@Id
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "ID_TYPE_PREPA")
	private List<TypePrepa> listeTypePrepa;
	
	@Column(name = "DUREE")
	private int duree;
	
	@Column(name = "ID_UNITE_DUREE")
	private int id_unite_duree;
	
	@Column(name = "DUREE_SECOND")
	private int duree_second;

	public SePrepare(Recette recette, List<TypePrepa> listeTypePrepa, int duree, int id_unite_duree, int duree_second) {

		this.recette = recette;
		this.listeTypePrepa = listeTypePrepa;
		this.duree = duree;
		this.id_unite_duree = id_unite_duree;
		this.duree_second = duree_second;
	}	

	public SePrepare() {}

	
	/*
	 * Getters Setters
	 */

	private Recette getRecette() {
		return recette;
	}

	private List<TypePrepa> getListeTypePrepa() {
		return listeTypePrepa;
	}

	private int getDuree() {
		return duree;
	}

	private int getId_unite_duree() {
		return id_unite_duree;
	}

	private int getDuree_second() {
		return duree_second;
	}

	@SuppressWarnings("unused")
	private void setRecette(Recette recette) {
		this.recette = recette;
	}

	@SuppressWarnings("unused")
	private void setListeTypePrepa(List<TypePrepa> listeTypePrepa) {
		this.listeTypePrepa = listeTypePrepa;
	}

	@SuppressWarnings("unused")
	private void setDuree(int duree) {
		this.duree = duree;
	}

	@SuppressWarnings("unused")
	private void setId_unite_duree(int id_unite_duree) {
		this.id_unite_duree = id_unite_duree;
	}

	@SuppressWarnings("unused")
	private void setDuree_second(int duree_second) {
		this.duree_second = duree_second;
	}

	@Override
	public String toString() {
		return "SePrepare [recette=" + recette + ", listeTypePrepa=" + listeTypePrepa + ", duree=" + duree
				+ ", id_unite_duree=" + id_unite_duree + ", duree_second=" + duree_second + "]";
	}
	
	
}
