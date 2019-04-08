package les.concepteurs.fooder.metier;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="recette")
public class Recette {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_REC")
	private int idRec;
	
	@OneToOne(cascade= {CascadeType.DETACH,
						CascadeType.MERGE,
						CascadeType.PERSIST,
						CascadeType.REFRESH})
	@JoinColumn(name="ID_THEME")
	private ThemeRecette themeRec;
	
	@OneToOne(cascade= {CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="ID_TYPER")
	private TypeRecette typeRec;
	
	@Column(name="NOM_REC")
	private String nomRec;
		
	@Column(name="SEL_POIVRE")
	private boolean selPoivre;
	
	@Column(name="PHOTO_REC")
	private String photoRec;
	
	@Column(name="COMPLEMENT_REC")
	private String complementRec;
	
	private ListeDescriptionsRecette descRec;
	private ListeDenrees denrees;
	private ListePreparations listePrepa;
	
	/*
	@OneToMany
	private ArrayList<Denree> listeDenree;
	*/
	
	/**
	 * @param idRec (int)
	 * @param themeRec (ThemeRecette)
	 * @param typeRec (TypeRecette)
	 * @param nomRec (String)
	 * @param descRec (ListeDescRec)
	 * @param selPoivre (boolean)
	 * @param photoRec (String)
	 * @param complementRec (String)
	 * @param denrees (ListeDenrees)
	 */
	public Recette(
			ThemeRecette themeRec, 
			TypeRecette typeRec, 
			String nomRec, 
			boolean selPoivre, 
			String photoRec, 
			String complementRec, 
			ListeDescriptionsRecette descRec,
			ListeDenrees denrees,
			ListePreparations listePrepa) 
	{
		this.themeRec = themeRec;
		this.typeRec = typeRec;
		this.nomRec = nomRec;
		this.selPoivre = selPoivre;
		this.photoRec = photoRec;
		this.complementRec = complementRec;
		this.descRec = descRec;
		this.denrees = denrees;
		this.listePrepa = listePrepa;		
	}
	
	/**
	 * Default Constructor
	 */
	public Recette() {}
	
	
	/*
	 * Utilities
	 */

	public int getIdRec() {
		return idRec;
	}

	public String getNomRec() {
		return nomRec;
	}

	public ListeDescriptionsRecette getDescRec() {
		return descRec;
	}

	public boolean isSelPoivre() {
		return selPoivre;
	}

	public String getPhotoRec() {
		return photoRec;
	}

	public String getComplementRec() {
		return complementRec;
	}

	public ListeDenrees getDenrees() {
		return denrees;
	}

	public ListePreparations getListePrepa() {
		return listePrepa;
	}

	public void setIdRec(int idRec) {
		this.idRec = idRec;
	}

	public void setNomRec(String nomRec) {
		this.nomRec = nomRec;
	}

	public void setDescRec(ListeDescriptionsRecette descRec) {
		this.descRec = descRec;
	}

	public void setSelPoivre(boolean selPoivre) {
		this.selPoivre = selPoivre;
	}

	public void setPhotoRec(String photoRec) {
		this.photoRec = photoRec;
	}

	public void setComplementRec(String complementRec) {
		this.complementRec = complementRec;
	}

	public void setDenrees(ListeDenrees denrees) {
		this.denrees = denrees;
	}

	public void setListePrepa(ListePreparations listePrepa) {
		this.listePrepa = listePrepa;
	}

	public ThemeRecette getThemeRec() {
		return themeRec;
	}

	public void setThemeRec(ThemeRecette themeRec) {
		this.themeRec = themeRec;
	}

	public TypeRecette getTypeRec() {
		return typeRec;
	}

	public void setTypeRec(TypeRecette typeRec) {
		this.typeRec = typeRec;
	}

	@Override
	public String toString() {
		return "Recette [idRec=" + idRec + ", themeRec=" + themeRec + ", typeRec=" + typeRec + ", nomRec=" + nomRec
				+ ", selPoivre=" + selPoivre + ", photoRec=" + photoRec + ", complementRec=" + complementRec
				+ ", descRec=" + descRec + ", denrees=" + denrees + ", listePrepa=" + listePrepa + "]";
	}


	

}
		