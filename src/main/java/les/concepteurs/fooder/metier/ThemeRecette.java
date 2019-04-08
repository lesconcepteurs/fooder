package les.concepteurs.fooder.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="theme_recette")
public class ThemeRecette {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_THEME")
	private int idTheme;
	
	@Column(name="NOM_THEME")
	private String nomTheme;
	
	
	/**
	 * @param idTheme (int)
	 * @param nomTheme (String)
	 */
	public ThemeRecette(int idTheme, String nomTheme) {
		this.idTheme = idTheme;
		this.nomTheme = nomTheme;
	}
	
	public ThemeRecette() {}


	public int getIdTheme() {
		return idTheme;
	}
	public String getNomTheme() {
		return nomTheme;
	}
	public void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}
	public void setNomTheme(String nomTheme) {
		this.nomTheme = nomTheme;
	}


	@Override
	public String toString() {
		return "ThemeRecette [idTheme=" + idTheme + ", nomTheme=" + nomTheme + "]";
	}

}
