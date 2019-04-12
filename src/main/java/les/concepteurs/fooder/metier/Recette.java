package les.concepteurs.fooder.metier;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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
	
	//OneToMany car pour une Recette on a plusieurs Denree
	//cascade.ALL car on veut appliquer la cascade pour tous les types, y compris la suppression.
	// en effet, quand on supprime une recette on veut aussi supprimer les denrees associées.
	// mappedBy pointe sur la propriété de recette de la classe Denree
	@OneToMany(mappedBy="recette", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Denree> listeDenrees;
	
	// On utilise @LazyCollection car il n'est pas possible d'avoir 2X FetchType.EAGER dans la meme class
	@OneToMany(mappedBy="idRec")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Description> listeDescriptionsRecette;

	
	//private ListePreparations listePrepa;
	@OneToMany(mappedBy="recette")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<SePrepare> listeSePrepares;
	
	
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
			List<Description> descRec,
			List<Denree> listeDenrees,
			//ListePreparations listePrepa
			List<SePrepare> listeSePrepares
			) 
	{
		this.themeRec = themeRec;
		this.typeRec = typeRec;
		this.nomRec = nomRec;
		this.selPoivre = selPoivre;
		this.photoRec = photoRec;
		this.complementRec = complementRec;
		this.listeDenrees = listeDenrees;
		this.listeDescriptionsRecette = descRec;
		//this.listePrepa = listePrepa;		
		this.listeSePrepares = listeSePrepares;
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

	public List<Description> getListeDescriptionsRecette() {
		return listeDescriptionsRecette;
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

	public List<SePrepare> getListeSePrepares() {
		return listeSePrepares;
	}

	/*public ListePreparations getListePrepa() {
		return listePrepa;
	}*/
  
	public List<Denree> getListeDenrees() {
		return listeDenrees;
	}

	public void setIdRec(int idRec) {
		this.idRec = idRec;
	}

	public void setNomRec(String nomRec) {
		this.nomRec = nomRec;
	}

	public void setListeDescriptionsRecette(List<Description> descRec) {
		this.listeDescriptionsRecette = descRec;
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

	public void setListeDenrees(List<Denree> listeDenrees) {
		this.listeDenrees = listeDenrees;
	}

	/*public void setListePrepa(ListePreparations listePrepa) {
		this.listePrepa = listePrepa;
	}*/
	
	 void setListeSePrepares(List<SePrepare> listeSePrepares) {
		this.listeSePrepares = listeSePrepares;
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
				+ ", descRec=" + listeDescriptionsRecette + ", listeDenrees=" + listeDenrees + ", listeSePrepares=" + listeSePrepares + "]";
	}

}
		